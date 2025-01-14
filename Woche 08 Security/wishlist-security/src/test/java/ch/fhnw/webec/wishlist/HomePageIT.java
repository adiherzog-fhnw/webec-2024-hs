package ch.fhnw.webec.wishlist;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.util.Set;

import static java.util.stream.Collectors.toSet;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
@AutoConfigureTestDatabase
public class HomePageIT {

    @LocalServerPort
    int port;

    WebDriver driver = new HtmlUnitDriver();

    @Test
    public void containsWishlistLinks() {
        driver.navigate().to("http://localhost:" + port + "/");
        var urls = findWishlistUrls();
        assertEquals(3, urls.size());
    }

    @Test
    public void deleteButtonDeletesWishlist() {
        driver.navigate().to("http://localhost:" + port + "/");
        var deleteButtons = driver.findElements(By.cssSelector("button.delete"));
        assertEquals(3, deleteButtons.size());
        deleteButtons.get(0).click();
        assertEquals(2, findWishlistUrls().size());
    }

    private Set<String> findWishlistUrls() {
        var links = driver.findElements(By.tagName("a"));
        return links.stream()
                .map(e -> e.getAttribute("href"))
                .filter(url -> url.contains("/wishlist/"))
                .collect(toSet());
    }
}

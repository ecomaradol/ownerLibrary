import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.assertj.core.api.Assertions.assertThat;

import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {
    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url https://www.dji.com/products/professional", () ->
                open("https://www.dji.com/products/professional"));

        step("Page title should have text 'Professional - DJI'", () -> {
            String expectedTitle = "Professional - DJI";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Page should have 'Store' button")
    void storeButtonExistTest() {
        step("Open url 'https://www.dji.com/products/professional'", () ->
                open("https://www.dji.com/products/professional"));

        step("Button 'Store'", () -> {
            $(".dui-btn.dui-btn-sm.dui-btn-buy.btn-store.ga-data").shouldHave(text("Store"));
        });
    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Page should have left-side menu")
    void leftSideExistTest() {
        step("Open url 'https://www.dji.com/products/professional'", () ->
                open("https://www.dji.com/products/professional"));

        step("Left-side menu", () -> {
            $(".dui-sidenav").should(exist);
        });

    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Page should have footer")
    void footerExistTest() {
        step("Open url 'https://www.dji.com/products/professional'", () ->
                open("https://www.dji.com/products/professional"));

        step("Page should have footer", () -> {
            $("#site-footer").should(exist);
        });
    }

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Left-side menu should have links")
    void leftSideLinksTest() {
        step("Open url 'https://www.dji.com/products/professional'", () ->
                open("https://www.dji.com/products/professional"));

        step("'Ground-Based Cinematography System' link", () -> {
            $("#ground-based-cinematography-system-nav").shouldHave(text("Ground-Based Cinematography System"));
        });
        step("'Aerial Cinematography System' link", () -> {
            $("#integrated-system-nav").shouldHave(text("Aerial Cinematography System"));
        });
        step("'Gimbal Cameras' link", () -> {
            $("#camera-gimbal-nav").shouldHave(text("Gimbal Cameras"));
        });
        step("'Camera Stabilizer' link", () -> {
            $("#camera-stabilizer-nav").shouldHave(text("Camera Stabilizer"));
        });
        step("'Pro Accessories' link", () -> {
            $("#professional-accessories-nav").shouldHave(text("Pro Accessories"));
        });

    }
}

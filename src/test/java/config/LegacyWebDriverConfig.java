package config;

import java.net.URL;
import java.util.Objects;

public class LegacyWebDriverConfig {

    public String baseURL() {
        String baseUrl = System.getProperty("baseURL");
        if (Objects.isNull(baseUrl)) {
            baseUrl = "https://github.com";
        }
        return baseUrl;
    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        if (Objects.isNull(browser)) {
            return Browser.CHROME;
        }
        return Browser.valueOf(browser);
    }

    public boolean isRemote() {
        String isRemote = System.getProperty("isRemote");
        if (Objects.isNull(isRemote)) {
            return false;
        }
        return Boolean.parseBoolean(isRemote);
    }

    public URL getRemoteURL() {
        String remoteURL = System.getProperty("remoteURL");
        if (Objects.isNull(remoteURL)) {
            return null;
        }
        return null;
    }
    }


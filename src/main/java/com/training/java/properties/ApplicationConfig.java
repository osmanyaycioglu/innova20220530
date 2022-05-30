package com.training.java.properties;

@PropertyFile("myconfig.properties")
public class ApplicationConfig {
    @PropertyBind("app.name")
    private String appName;
    @PropertyBind("app.version")
    private String appVersion;
    @PropertyBind("app.libs")
    private String appLibs;
    @PropertyBind("app.test.colum")
    private String appTestColum;
    @PropertyBind("deneme.osman")
    private String denemOsman;
    @PropertyBind("deneme.port")
    private Integer port;
    @PropertyBind("deneme.timeout")
    private long timeOut;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getAppLibs() {
        return appLibs;
    }

    public void setAppLibs(String appLibs) {
        this.appLibs = appLibs;
    }

    public String getAppTestColum() {
        return appTestColum;
    }

    public void setAppTestColum(String appTestColum) {
        this.appTestColum = appTestColum;
    }

    public String getDenemOsman() {
        return denemOsman;
    }

    public void setDenemOsman(String denemOsman) {
        this.denemOsman = denemOsman;
    }


    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public long getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(long timeOut) {
        this.timeOut = timeOut;
    }

    @Override
    public String toString() {
        return "ApplicationConfig{" +
                "appName='" + appName + '\'' +
                ", appVersion='" + appVersion + '\'' +
                ", appLibs='" + appLibs + '\'' +
                ", appTestColum='" + appTestColum + '\'' +
                ", denemOsman='" + denemOsman + '\'' +
                ", port=" + port +
                ", timeOut=" + timeOut +
                '}';
    }
}

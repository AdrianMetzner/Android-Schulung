package wps.de.android_schulung_app;

/**
 * Created by Adrian on 11.03.2018.
 */

public class TestDataMethod {

    private final String deviceName;
    private final String deviceAndroidVersion;

    public TestDataMethod(String deviceName, String deviceAndroidVersion) {
        this.deviceName = deviceName;
        this.deviceAndroidVersion = deviceAndroidVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getDeviceAndroidVersion() {
        return deviceAndroidVersion;
    }
}

package co.lateralview.myapp.infraestructure.manager.bluetooth.myBtDevices;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public final class MyBluetoothDevicesConstants {

    private MyBluetoothDevicesConstants() {

    }

    public static final List<String> DEVICES_SUPPORTED = Arrays.asList("My Own BT Device V1",
            "My Own BT Device V2");

    private static final String MY_OWN_DEVICE_SERVICE = "52401523-f97c-7f90-0e7f-6c6f4e36db1c";
    private static final String WRITE_READ_ID = "52401524-f97c-7f90-0e7f-6c6f4e36db1c";

    public static final UUID UUID_MY_OWN_DEVICE_SERVICE = UUID.fromString(MY_OWN_DEVICE_SERVICE);
    public static final UUID UUID_WRITE_READ_ID = UUID.fromString(WRITE_READ_ID);
}

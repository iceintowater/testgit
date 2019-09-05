import java.util.Arrays;
import java.util.List;




public enum AppDeviceType  {

    /**
     * NULL
     */
    NULL(-1, "NULL"),

    /**
     * ios客户端
     */
    IOS(1, "ios"),

    /**
     * android客户端
     */
    ANDROID(2, "android"),

    /**
     * 未知客户端
     */
    APP(3, "app");

    public static final List<Integer> VALID_TYPES = Arrays.asList(IOS.value,
            ANDROID.value);

    /**
     * 值
     */
    private final int value;

    /**
     * 描述
     */
    private final String desc;

    private AppDeviceType(int v, String d) {
        value = v;
        desc = d;
    }

    public int getValue() {
        return this.value;
    }

    public String getDesc() {
        return desc;
    }


    public AppDeviceType genEnumByIntValue(int intValue) {
        for (AppDeviceType item: AppDeviceType.values()) {
            if (item.value == intValue)
                return item;
        }
        return null;
    }

}

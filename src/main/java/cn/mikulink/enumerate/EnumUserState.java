package cn.mikulink.enumerate;

/**
 * @author MikuLink
 * @date 2020/8/1 16:48
 * for the Reisen
 * 用户状态枚举
 */
public enum EnumUserState implements IEnum {
    Normal(0, "正常"),
    Ban(1, "封禁");

    private int value;
    private String text;

    //私有构造方法
    private EnumUserState(int value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * 根据枚举数字值，查询枚举信息
     */
    public static EnumUserState valueOf(int value) {
        for (EnumUserState e : EnumUserState.values()) {
            if (e.getValue() == value) {
                return e;
            }
        }
        return null;
    }

    public int getValue() {
        return this.value;
    }

    public String getText() {
        return this.text;
    }
}

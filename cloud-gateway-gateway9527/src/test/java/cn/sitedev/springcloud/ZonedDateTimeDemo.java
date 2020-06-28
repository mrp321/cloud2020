package cn.sitedev.springcloud;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {
    public static void main(String[] args) {
        // 获取当前时间(默认时区)
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        // 获取当前时间(指定时区)
        zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zonedDateTime);
    }
}

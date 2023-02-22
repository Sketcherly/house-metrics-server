package li.dongpo.house.metrics.constant;

import com.google.common.base.Splitter;

import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * @author dongpo.li
 * @date 2022/1/14
 */
public class Constant {

    public static final String SERVER_ADMIN_NAMESPACE = "/admin";

    public static final Splitter COMMA_SPLITTER = Splitter.on(",").trimResults().omitEmptyStrings();

    public static final ZoneId DEFAULT_ZONE_ID = ZoneId.of("Asia/Shanghai");
    public static final ZoneOffset DEFAULT_ZONE_OFFSET = ZoneOffset.of("+8");

}

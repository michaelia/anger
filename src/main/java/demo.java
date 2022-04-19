import com.demo.anger.exception.httpCode.UserEorrCode;
import com.demo.anger.exception.httpType.BeanResponse;
import com.demo.anger.exception.httpType.ResponseData;

/**
 * @Author 周敏怡
 * @Description //TODO 调试专用的
 * @version: v1.8.0
 * @Date 2021/12/5 3:49 PM
 **/
public class demo {
    public static void main(String[] args) {
        demo demo = new demo();
        System.out.println(UserEorrCode.USER_NOT_Live);
//        demo.failCatch(UserEorrCode.USER_NOT_Live);
    }
//    public BeanResponse failCatch(UserEorrCode userEorrCode){
//        System.out.println("111");
//        return ResponseData.fail(userEorrCode);
//    }
}

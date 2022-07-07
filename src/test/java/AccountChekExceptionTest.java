import com.example.Account;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class AccountChekExceptionTest {
    public String name=null;
    @Test(expected = Exception.class)
    @DisplayName("Проверка работы, если вылетает ошибка")
    public void checkNameTest() {
        Assert.assertEquals(false, new Account(name).checkNameToEmboss());
    }
}

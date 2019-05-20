/**
 * @Classname OperationFactory
 * @Description TODO
 * @Author 马维俊
 * @Version V1.0.0
 * @Date 2019/3/3 23:24
 */
public class OperationFactory {
    public static Operation creatOperation(String operate){
        Operation oper = null;
        if ("+".equals(operate)) {
            oper = new OperationAdd();
        }
        return  oper;
    }
}

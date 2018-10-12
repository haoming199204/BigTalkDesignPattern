package pers.haoming.bigtalkdesignpatten.staticfactory;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            String strNumberA = "1";
            String strOperate = "w";
            String strNumberB = "0";
            String strResult = "";

            Operation operation = OperationFactory.createOperation(strOperate);
            if (operation == null) {
                throw new Exception("操作符不存在");
            }
            operation.setNumberA(Double.parseDouble(strNumberA));
            operation.setNumberB(Double.parseDouble(strNumberB));

            strResult = String.valueOf(operation.getResult());

            System.out.println("结果是：" + strResult);
        } catch (Exception e) {
            System.out.println("您的输入有错:" + e.getMessage());
        }
    }
}

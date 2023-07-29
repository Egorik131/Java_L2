package sem_2.test_4;

public class Main {
    public static void main(String[] args) {
        Test_4 testObj = new Test_4();
        System.out.println("ID User: " + testObj.getUserId());
        System.out.println("ID Admin: " + testObj.getAdminId());

        int uID = IUserId.getUniversal();
        System.out.println(uID);

    }
}

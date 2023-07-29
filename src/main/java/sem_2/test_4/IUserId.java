package sem_2.test_4;

public interface IUserId {
    int getUserId();

    default int getAdminId(){ // метод по умолчанию
        return 1;
    }
    static int getUniversal(){
        return 0;
    }
}

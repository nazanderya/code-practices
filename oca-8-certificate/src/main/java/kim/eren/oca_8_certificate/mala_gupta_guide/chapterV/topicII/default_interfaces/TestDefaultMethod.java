package kim.eren.oca_8_certificate.mala_gupta_guide.chapterV.topicII.default_interfaces;

public class TestDefaultMethod implements A {
    //searching some documents
    public static void main(String[] args) {
        B a = new TestDefaultMethod();
        a.testThisKeyword();
    }

    @Override
    public void print() {

        System.out.println("prinnt from a ");

    }
}
public class Main {
    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.passport = "4444 № 444444444";
        post.subscription = true;
        post.mobileNumber = "+7(999)999-99-99";
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 06;
        post.birthday.year = 1999;

    }
}

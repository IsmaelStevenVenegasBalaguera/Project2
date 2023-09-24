package GroupEx2;

public class Task12Registration {

        private String email;
        private String userName;
        private String password;

        public void setEmail(String email) {
            if (isValidEmail(email)) {
                this.email = email;
            } else {
                System.out.println("Invalid email. Valid email is Yahoo.");
            }
        }

        public void setUserName(String userName) {
            if (isValidUserName(userName)) {
                this.userName = userName;
            } else {
                System.out.println("Invalid username. Username should not be empty and should be at least 7 characters long.");
            }
        }

        public void setPassword(String password) {
            if (isValidPassword(password)) {
                this.password = password;
            } else {
                System.out.println("Invalid password. Password should not be empty, should be at least 7 characters long, and should not contain the username.");
            }
        }

        private boolean isValidEmail(String email) {
            return email != null && email.toLowerCase().endsWith("@yahoo.com");
        }

        private boolean isValidUserName(String userName) {
            return userName != null && userName.length() > 6;
        }

        private boolean isValidPassword(String password) {
            return password != null && password.length() > 6 && !password.contains(userName);
        }
        public static void main(String[] args) {
            Task12Registration user = new Task12Registration();

            user.setEmail("michael77@yahoo.com");
            user.setUserName("lalalala");
            user.setPassword("Mypassword123*");


            System.out.println("Email: " + user.email);
            System.out.println("Username: " + user.userName);
            System.out.println("Password: " + user.password);
        }
    }



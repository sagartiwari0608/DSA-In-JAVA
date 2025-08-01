package Records_in_java;

// public record UserRecord(int id, String name, String email) {}

// The above line and below whole class definition are equal. Records are used for POJO classes which are just used to hold data for an obj.
// we were able to achieve everything that we did here with just one single line of code. 
// The only difference and important difference is that The fields id name and email defined here would be final. 
// hence while using we will have to initialise them as well as we will not be able to change them later as we do not have setter methdos in records as the fields are final.
// we can also define our own values and methods that optional. 
public record UserRecord(int id, String name, String email) {
    public static final String nickname = "User"; // we can only define static fields in records, no instance fields allowed.
    // we can also create our own All Args constructure method in case we want to perform some validation on the values or due to any other reason.
    // @Override

    public UserRecord(int id, String name, String email) {
        if (id < 0) {
            throw new IllegalArgumentException("id cannot be negative");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null or blank");
        }
        if (email == null || email.isBlank() || !email.contains(".com")) {
            throw new IllegalArgumentException("email cannot be null or blank");
        }
        // if everything is fine then we assign the values to the fieldds.
        this.id = id;
        this.name = name;
        this.email = email;
    }

}

// public class UserRecord {
//     private int id;
//     private String name;
//     private String email;

//     UserRecord() {
//         this.id = 0;
//         this.name = "";
//         this.email = "";
//     }

//     UserRecord(int id, String name, String email) {
//         this.id = id;
//         this.name = name;
//         this.email = email;
//     }

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getEmail() {
//         return email;
//     }

//     public void setEmail(String email) {
//         this.email = email;
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         result = prime * result + ((email == null) ? 0 : email.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         UserRecord other = (UserRecord) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         if (email == null) {
//             if (other.email != null)
//                 return false;
//         } else if (!email.equals(other.email))
//             return false;
//         return true;
//     }

//     @Override
//     public String toString() {
//         return "UserRecord [id=" + id + ", name=" + name + ", email=" + email + "]";
//     }
// }
import java.util.Objects;

public class Customer {
    private String phone;
    private String fullName;

    public  Customer() {

    }

    public Customer(String phone, String fullName) {
        this.phone = phone;
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(phone, customer.phone) && Objects.equals(fullName, customer.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, fullName);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "phone='" + phone + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

package payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER_ORDER")
class Order {

  public enum Status {
    IN_PROGRESS, //
    COMPLETED, //
    CANCELLED
  }

  private @Id
  @GeneratedValue
  Long id;

  private String description;
  private Status status;

  public Order() {
  }

  public Order(String description, Status status) {
    this.description = description;
    this.status = status;
  }

  public Long getId() {
    return this.id;
  }

  public String getDescription() {
    return this.description;
  }

  public Status getStatus() {
    return this.status;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    else if (!(o instanceof Order))
      return false;

    Order aOrder = (Order) o;

    return Objects.equals(this.id, aOrder.id) && Objects.equals(this.description, aOrder.description)
        && this.status == aOrder.status;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.description, this.status);
  }

  @Override
  public String toString() {
    return "Order{" + "id=" + this.id + ", description='" + this.description + '\'' + ", status=" + this.status + '}';
  }
}

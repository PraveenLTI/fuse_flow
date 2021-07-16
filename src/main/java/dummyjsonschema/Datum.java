
package dummyjsonschema;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "employee_name",
    "employee_salary",
    "employee_age",
    "profile_image"
})
public class Datum {

    @JsonProperty("id")
    private int id;
    @JsonProperty("employee_name")
    private String employeeName;
    @JsonProperty("employee_salary")
    private int employeeSalary;
    @JsonProperty("employee_age")
    private int employeeAge;
    @JsonProperty("profile_image")
    private String profileImage;

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The employeeName
     */
    @JsonProperty("employee_name")
    public String getEmployeeName() {
        return employeeName;
    }

    /**
     * 
     * @param employeeName
     *     The employee_name
     */
    @JsonProperty("employee_name")
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 
     * @return
     *     The employeeSalary
     */
    @JsonProperty("employee_salary")
    public int getEmployeeSalary() {
        return employeeSalary;
    }

    /**
     * 
     * @param employeeSalary
     *     The employee_salary
     */
    @JsonProperty("employee_salary")
    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    /**
     * 
     * @return
     *     The employeeAge
     */
    @JsonProperty("employee_age")
    public int getEmployeeAge() {
        return employeeAge;
    }

    /**
     * 
     * @param employeeAge
     *     The employee_age
     */
    @JsonProperty("employee_age")
    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    /**
     * 
     * @return
     *     The profileImage
     */
    @JsonProperty("profile_image")
    public String getProfileImage() {
        return profileImage;
    }

    /**
     * 
     * @param profileImage
     *     The profile_image
     */
    @JsonProperty("profile_image")
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

}

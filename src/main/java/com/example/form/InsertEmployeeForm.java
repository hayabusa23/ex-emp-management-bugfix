package com.example.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.Date;

public class InsertEmployeeForm {
    /**
     * id
     */
    private Integer id;
    /**
     * 従業員名
     */
    @NotBlank(message = "氏名の入力は必須です")
    private String name;
    /**
     * 画像
     */
    private MultipartFile image;
    /**
     * 性別
     */
    @NotBlank(message = "性別の入力は必須です")
    private String gender;
    /**
     * 入社日
     */
    @NotNull(message = "入社日の入力は必須です")
    private LocalDate hireDate;
    /**
     * メールアドレス
     */
    @NotBlank(message = "メールアドレスの入力は必須です")
    private String mailAddress;
    /**
     * 郵便番号
     */
    @NotBlank(message = "郵便番号の入力は必須です")
    private String zipCode;
    /**
     * 住所
     */
    @NotBlank(message = "住所の入力は必須です")
    private String address;
    /**
     * 電話番号
     */
    @NotBlank(message = "電話番号の入力は必須です")
    @Pattern(regexp = "^\\d{2,4}-\\d{2,4}-\\d{4}$", message = "電話番号の形式が正しくありません（例：090-1234-5678）")
    private String telephone;
    /**
     * 給料
     */
    @NotNull(message = "給料の入力は必須です")
    private Integer salary;
    /**
     * 特性
     */
    @NotBlank(message = "特性の入力は必須です")
    private String characteristics;
    /**
     * 扶養人数
     */
    @NotNull(message = "扶養人数の入力は必須です")
    private Integer dependentsCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public Integer getDependentsCount() {
        return dependentsCount;
    }

    public void setDependentsCount(Integer dependentsCount) {
        this.dependentsCount = dependentsCount;
    }

    @Override
    public String toString() {
        return "InsertEmployeeForm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image=" + image +
                ", gender='" + gender + '\'' +
                ", hireDate=" + hireDate +
                ", mailAddress='" + mailAddress + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salary=" + salary +
                ", characteristics='" + characteristics + '\'' +
                ", dependentsCount=" + dependentsCount +
                '}';
    }
}

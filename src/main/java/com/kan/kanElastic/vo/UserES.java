package com.kan.kanElastic.vo;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;
@Document(indexName = "user")
public class UserES {
	    
    @Id
    private int user_id;
    @Field(type = FieldType.Text)
    private String first_name;
    @Field(type = FieldType.Text)
    private String middle_name;
    @Field(type = FieldType.Text)
    private String last_name;
    @Field(type = FieldType.Text)
    private String email_id;
    @Field(type = FieldType.Text)
    private String mobno;
    @Field(type = FieldType.Text)
    private String dateofbirth;
    @Field(type = FieldType.Text)
    private String gender; 
    @Field(type = FieldType.Text)
    private String status;
    @Field(type = FieldType.Text)
    private String branch;
    @Field(type = FieldType.Text)
    private String usertype;
    @Field(type = FieldType.Integer)
    private int f_gender_id;
    @Field(type = FieldType.Text)
    private String created_time;
    @Field(type = FieldType.Text)
    private String updated_time;  
    @Field(type = FieldType.Integer)
    private int f_status_id;
    @Field(type = FieldType.Integer)
    private int f_education_id;
    @Field(type = FieldType.Integer)
    private int f_personal_document_id;
    @Field(type = FieldType.Integer)
    private int f_caste_id;
    @Field(type = FieldType.Integer)
    private int f_usertype_id;
    @Field(type = FieldType.Integer)
    private int f_branch_id;
    @Field(type = FieldType.Text)
    private String password;
  
  
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getMiddle_name() {
        return middle_name;
    }
    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getEmail_id() {
        return email_id;
    }
    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }
    public String getDateofbirth() {
        return dateofbirth;
    }
    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    public String getMobno() {
        return mobno;
    }
    public void setMobno(String mobno) {
        this.mobno = mobno;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getUsertype() {
        return usertype;
    }
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
	public int getF_gender_id() {
		return f_gender_id;
	}
	public void setF_gender_id(int f_gender_id) {
		this.f_gender_id = f_gender_id;
	}
	public String getCreated_time() {
		return created_time;
	}
	public void setCreated_time(String created_time) {
		this.created_time = created_time;
	}
	public String getUpdated_time() {
		return updated_time;
	}
	public void setUpdated_time(String updated_time) {
		this.updated_time = updated_time;
	}
	public int getF_status_id() {
		return f_status_id;
	}
	public void setF_status_id(int f_status_id) {
		this.f_status_id = f_status_id;
	}
	public int getF_education_id() {
		return f_education_id;
	}
	public void setF_education_id(int f_education_id) {
		this.f_education_id = f_education_id;
	}
	public int getF_personal_document_id() {
		return f_personal_document_id;
	}
	public void setF_personal_document_id(int f_personal_document_id) {
		this.f_personal_document_id = f_personal_document_id;
	}
	public int getF_caste_id() {
		return f_caste_id;
	}
	public void setF_caste_id(int f_caste_id) {
		this.f_caste_id = f_caste_id;
	}
	public int getF_usertype_id() {
		return f_usertype_id;
	}
	public void setF_usertype_id(int f_usertype_id) {
		this.f_usertype_id = f_usertype_id;
	}
	public int getF_branch_id() {
		return f_branch_id;
	}
	public void setF_branch_id(int f_branch_id) {
		this.f_branch_id = f_branch_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}

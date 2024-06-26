package com.web.hospital.model;

import java.util.ArrayList;
import java.util.List;

public class PatientsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    public PatientsExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdpIsNull() {
            addCriterion("idP is null");
            return (Criteria) this;
        }

        public Criteria andIdpIsNotNull() {
            addCriterion("idP is not null");
            return (Criteria) this;
        }

        public Criteria andIdpEqualTo(Integer value) {
            addCriterion("idP =", value, "idp");
            return (Criteria) this;
        }

        public Criteria andIdpNotEqualTo(Integer value) {
            addCriterion("idP <>", value, "idp");
            return (Criteria) this;
        }

        public Criteria andIdpGreaterThan(Integer value) {
            addCriterion("idP >", value, "idp");
            return (Criteria) this;
        }

        public Criteria andIdpGreaterThanOrEqualTo(Integer value) {
            addCriterion("idP >=", value, "idp");
            return (Criteria) this;
        }

        public Criteria andIdpLessThan(Integer value) {
            addCriterion("idP <", value, "idp");
            return (Criteria) this;
        }

        public Criteria andIdpLessThanOrEqualTo(Integer value) {
            addCriterion("idP <=", value, "idp");
            return (Criteria) this;
        }

        public Criteria andIdpIn(List<Integer> values) {
            addCriterion("idP in", values, "idp");
            return (Criteria) this;
        }

        public Criteria andIdpNotIn(List<Integer> values) {
            addCriterion("idP not in", values, "idp");
            return (Criteria) this;
        }

        public Criteria andIdpBetween(Integer value1, Integer value2) {
            addCriterion("idP between", value1, value2, "idp");
            return (Criteria) this;
        }

        public Criteria andIdpNotBetween(Integer value1, Integer value2) {
            addCriterion("idP not between", value1, value2, "idp");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanIsNull() {
            addCriterion("hoTenBenhNhan is null");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanIsNotNull() {
            addCriterion("hoTenBenhNhan is not null");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanEqualTo(String value) {
            addCriterion("hoTenBenhNhan =", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanNotEqualTo(String value) {
            addCriterion("hoTenBenhNhan <>", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanGreaterThan(String value) {
            addCriterion("hoTenBenhNhan >", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanGreaterThanOrEqualTo(String value) {
            addCriterion("hoTenBenhNhan >=", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanLessThan(String value) {
            addCriterion("hoTenBenhNhan <", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanLessThanOrEqualTo(String value) {
            addCriterion("hoTenBenhNhan <=", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanLike(String value) {
            addCriterion("hoTenBenhNhan like", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanNotLike(String value) {
            addCriterion("hoTenBenhNhan not like", value, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanIn(List<String> values) {
            addCriterion("hoTenBenhNhan in", values, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanNotIn(List<String> values) {
            addCriterion("hoTenBenhNhan not in", values, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanBetween(String value1, String value2) {
            addCriterion("hoTenBenhNhan between", value1, value2, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andHotenbenhnhanNotBetween(String value1, String value2) {
            addCriterion("hoTenBenhNhan not between", value1, value2, "hotenbenhnhan");
            return (Criteria) this;
        }

        public Criteria andNamsinhIsNull() {
            addCriterion("namSinh is null");
            return (Criteria) this;
        }

        public Criteria andNamsinhIsNotNull() {
            addCriterion("namSinh is not null");
            return (Criteria) this;
        }

        public Criteria andNamsinhEqualTo(String value) {
            addCriterion("namSinh =", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhNotEqualTo(String value) {
            addCriterion("namSinh <>", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhGreaterThan(String value) {
            addCriterion("namSinh >", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhGreaterThanOrEqualTo(String value) {
            addCriterion("namSinh >=", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhLessThan(String value) {
            addCriterion("namSinh <", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhLessThanOrEqualTo(String value) {
            addCriterion("namSinh <=", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhLike(String value) {
            addCriterion("namSinh like", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhNotLike(String value) {
            addCriterion("namSinh not like", value, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhIn(List<String> values) {
            addCriterion("namSinh in", values, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhNotIn(List<String> values) {
            addCriterion("namSinh not in", values, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhBetween(String value1, String value2) {
            addCriterion("namSinh between", value1, value2, "namsinh");
            return (Criteria) this;
        }

        public Criteria andNamsinhNotBetween(String value1, String value2) {
            addCriterion("namSinh not between", value1, value2, "namsinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhIsNull() {
            addCriterion("gioiTinh is null");
            return (Criteria) this;
        }

        public Criteria andGioitinhIsNotNull() {
            addCriterion("gioiTinh is not null");
            return (Criteria) this;
        }

        public Criteria andGioitinhEqualTo(String value) {
            addCriterion("gioiTinh =", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhNotEqualTo(String value) {
            addCriterion("gioiTinh <>", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhGreaterThan(String value) {
            addCriterion("gioiTinh >", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhGreaterThanOrEqualTo(String value) {
            addCriterion("gioiTinh >=", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhLessThan(String value) {
            addCriterion("gioiTinh <", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhLessThanOrEqualTo(String value) {
            addCriterion("gioiTinh <=", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhLike(String value) {
            addCriterion("gioiTinh like", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhNotLike(String value) {
            addCriterion("gioiTinh not like", value, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhIn(List<String> values) {
            addCriterion("gioiTinh in", values, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhNotIn(List<String> values) {
            addCriterion("gioiTinh not in", values, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhBetween(String value1, String value2) {
            addCriterion("gioiTinh between", value1, value2, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andGioitinhNotBetween(String value1, String value2) {
            addCriterion("gioiTinh not between", value1, value2, "gioitinh");
            return (Criteria) this;
        }

        public Criteria andSdtIsNull() {
            addCriterion("SDT is null");
            return (Criteria) this;
        }

        public Criteria andSdtIsNotNull() {
            addCriterion("SDT is not null");
            return (Criteria) this;
        }

        public Criteria andSdtEqualTo(String value) {
            addCriterion("SDT =", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotEqualTo(String value) {
            addCriterion("SDT <>", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtGreaterThan(String value) {
            addCriterion("SDT >", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtGreaterThanOrEqualTo(String value) {
            addCriterion("SDT >=", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtLessThan(String value) {
            addCriterion("SDT <", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtLessThanOrEqualTo(String value) {
            addCriterion("SDT <=", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtLike(String value) {
            addCriterion("SDT like", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotLike(String value) {
            addCriterion("SDT not like", value, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtIn(List<String> values) {
            addCriterion("SDT in", values, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotIn(List<String> values) {
            addCriterion("SDT not in", values, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtBetween(String value1, String value2) {
            addCriterion("SDT between", value1, value2, "sdt");
            return (Criteria) this;
        }

        public Criteria andSdtNotBetween(String value1, String value2) {
            addCriterion("SDT not between", value1, value2, "sdt");
            return (Criteria) this;
        }

        public Criteria andDiachiIsNull() {
            addCriterion("diaChi is null");
            return (Criteria) this;
        }

        public Criteria andDiachiIsNotNull() {
            addCriterion("diaChi is not null");
            return (Criteria) this;
        }

        public Criteria andDiachiEqualTo(String value) {
            addCriterion("diaChi =", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotEqualTo(String value) {
            addCriterion("diaChi <>", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiGreaterThan(String value) {
            addCriterion("diaChi >", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiGreaterThanOrEqualTo(String value) {
            addCriterion("diaChi >=", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLessThan(String value) {
            addCriterion("diaChi <", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLessThanOrEqualTo(String value) {
            addCriterion("diaChi <=", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiLike(String value) {
            addCriterion("diaChi like", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotLike(String value) {
            addCriterion("diaChi not like", value, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiIn(List<String> values) {
            addCriterion("diaChi in", values, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotIn(List<String> values) {
            addCriterion("diaChi not in", values, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiBetween(String value1, String value2) {
            addCriterion("diaChi between", value1, value2, "diachi");
            return (Criteria) this;
        }

        public Criteria andDiachiNotBetween(String value1, String value2) {
            addCriterion("diaChi not between", value1, value2, "diachi");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRoleIsNull() {
            addCriterion("role is null");
            return (Criteria) this;
        }

        public Criteria andRoleIsNotNull() {
            addCriterion("role is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEqualTo(String value) {
            addCriterion("role =", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotEqualTo(String value) {
            addCriterion("role <>", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThan(String value) {
            addCriterion("role >", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleGreaterThanOrEqualTo(String value) {
            addCriterion("role >=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThan(String value) {
            addCriterion("role <", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLessThanOrEqualTo(String value) {
            addCriterion("role <=", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleLike(String value) {
            addCriterion("role like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotLike(String value) {
            addCriterion("role not like", value, "role");
            return (Criteria) this;
        }

        public Criteria andRoleIn(List<String> values) {
            addCriterion("role in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotIn(List<String> values) {
            addCriterion("role not in", values, "role");
            return (Criteria) this;
        }

        public Criteria andRoleBetween(String value1, String value2) {
            addCriterion("role between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andRoleNotBetween(String value1, String value2) {
            addCriterion("role not between", value1, value2, "role");
            return (Criteria) this;
        }

        public Criteria andIddIsNull() {
            addCriterion("idD is null");
            return (Criteria) this;
        }

        public Criteria andIddIsNotNull() {
            addCriterion("idD is not null");
            return (Criteria) this;
        }

        public Criteria andIddEqualTo(Integer value) {
            addCriterion("idD =", value, "idd");
            return (Criteria) this;
        }

        public Criteria andIddNotEqualTo(Integer value) {
            addCriterion("idD <>", value, "idd");
            return (Criteria) this;
        }

        public Criteria andIddGreaterThan(Integer value) {
            addCriterion("idD >", value, "idd");
            return (Criteria) this;
        }

        public Criteria andIddGreaterThanOrEqualTo(Integer value) {
            addCriterion("idD >=", value, "idd");
            return (Criteria) this;
        }

        public Criteria andIddLessThan(Integer value) {
            addCriterion("idD <", value, "idd");
            return (Criteria) this;
        }

        public Criteria andIddLessThanOrEqualTo(Integer value) {
            addCriterion("idD <=", value, "idd");
            return (Criteria) this;
        }

        public Criteria andIddIn(List<Integer> values) {
            addCriterion("idD in", values, "idd");
            return (Criteria) this;
        }

        public Criteria andIddNotIn(List<Integer> values) {
            addCriterion("idD not in", values, "idd");
            return (Criteria) this;
        }

        public Criteria andIddBetween(Integer value1, Integer value2) {
            addCriterion("idD between", value1, value2, "idd");
            return (Criteria) this;
        }

        public Criteria andIddNotBetween(Integer value1, Integer value2) {
            addCriterion("idD not between", value1, value2, "idd");
            return (Criteria) this;
        }

        public Criteria andBenhIsNull() {
            addCriterion("benh is null");
            return (Criteria) this;
        }

        public Criteria andBenhIsNotNull() {
            addCriterion("benh is not null");
            return (Criteria) this;
        }

        public Criteria andBenhEqualTo(String value) {
            addCriterion("benh =", value, "benh");
            return (Criteria) this;
        }

        public Criteria andBenhNotEqualTo(String value) {
            addCriterion("benh <>", value, "benh");
            return (Criteria) this;
        }

        public Criteria andBenhGreaterThan(String value) {
            addCriterion("benh >", value, "benh");
            return (Criteria) this;
        }

        public Criteria andBenhGreaterThanOrEqualTo(String value) {
            addCriterion("benh >=", value, "benh");
            return (Criteria) this;
        }

        public Criteria andBenhLessThan(String value) {
            addCriterion("benh <", value, "benh");
            return (Criteria) this;
        }

        public Criteria andBenhLessThanOrEqualTo(String value) {
            addCriterion("benh <=", value, "benh");
            return (Criteria) this;
        }

        public Criteria andBenhLike(String value) {
            addCriterion("benh like", value, "benh");
            return (Criteria) this;
        }

        public Criteria andBenhNotLike(String value) {
            addCriterion("benh not like", value, "benh");
            return (Criteria) this;
        }

        public Criteria andBenhIn(List<String> values) {
            addCriterion("benh in", values, "benh");
            return (Criteria) this;
        }

        public Criteria andBenhNotIn(List<String> values) {
            addCriterion("benh not in", values, "benh");
            return (Criteria) this;
        }

        public Criteria andBenhBetween(String value1, String value2) {
            addCriterion("benh between", value1, value2, "benh");
            return (Criteria) this;
        }

        public Criteria andBenhNotBetween(String value1, String value2) {
            addCriterion("benh not between", value1, value2, "benh");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dbo.Patients
     *
     * @mbg.generated do_not_delete_during_merge Tue May 14 01:22:16 ICT 2024
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table dbo.Patients
     *
     * @mbg.generated Tue May 14 01:22:16 ICT 2024
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
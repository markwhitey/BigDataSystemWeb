package com.itwang.pojo;

import java.util.ArrayList;
import java.util.List;

public class MBaseTermExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MBaseTermExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andTermidIsNull() {
            addCriterion("termid is null");
            return (Criteria) this;
        }

        public Criteria andTermidIsNotNull() {
            addCriterion("termid is not null");
            return (Criteria) this;
        }

        public Criteria andTermidEqualTo(String value) {
            addCriterion("termid =", value, "termid");
            return (Criteria) this;
        }

        public Criteria andTermidNotEqualTo(String value) {
            addCriterion("termid <>", value, "termid");
            return (Criteria) this;
        }

        public Criteria andTermidGreaterThan(String value) {
            addCriterion("termid >", value, "termid");
            return (Criteria) this;
        }

        public Criteria andTermidGreaterThanOrEqualTo(String value) {
            addCriterion("termid >=", value, "termid");
            return (Criteria) this;
        }

        public Criteria andTermidLessThan(String value) {
            addCriterion("termid <", value, "termid");
            return (Criteria) this;
        }

        public Criteria andTermidLessThanOrEqualTo(String value) {
            addCriterion("termid <=", value, "termid");
            return (Criteria) this;
        }

        public Criteria andTermidLike(String value) {
            addCriterion("termid like", value, "termid");
            return (Criteria) this;
        }

        public Criteria andTermidNotLike(String value) {
            addCriterion("termid not like", value, "termid");
            return (Criteria) this;
        }

        public Criteria andTermidIn(List<String> values) {
            addCriterion("termid in", values, "termid");
            return (Criteria) this;
        }

        public Criteria andTermidNotIn(List<String> values) {
            addCriterion("termid not in", values, "termid");
            return (Criteria) this;
        }

        public Criteria andTermidBetween(String value1, String value2) {
            addCriterion("termid between", value1, value2, "termid");
            return (Criteria) this;
        }

        public Criteria andTermidNotBetween(String value1, String value2) {
            addCriterion("termid not between", value1, value2, "termid");
            return (Criteria) this;
        }

        public Criteria andTermnameIsNull() {
            addCriterion("termname is null");
            return (Criteria) this;
        }

        public Criteria andTermnameIsNotNull() {
            addCriterion("termname is not null");
            return (Criteria) this;
        }

        public Criteria andTermnameEqualTo(String value) {
            addCriterion("termname =", value, "termname");
            return (Criteria) this;
        }

        public Criteria andTermnameNotEqualTo(String value) {
            addCriterion("termname <>", value, "termname");
            return (Criteria) this;
        }

        public Criteria andTermnameGreaterThan(String value) {
            addCriterion("termname >", value, "termname");
            return (Criteria) this;
        }

        public Criteria andTermnameGreaterThanOrEqualTo(String value) {
            addCriterion("termname >=", value, "termname");
            return (Criteria) this;
        }

        public Criteria andTermnameLessThan(String value) {
            addCriterion("termname <", value, "termname");
            return (Criteria) this;
        }

        public Criteria andTermnameLessThanOrEqualTo(String value) {
            addCriterion("termname <=", value, "termname");
            return (Criteria) this;
        }

        public Criteria andTermnameLike(String value) {
            addCriterion("termname like", value, "termname");
            return (Criteria) this;
        }

        public Criteria andTermnameNotLike(String value) {
            addCriterion("termname not like", value, "termname");
            return (Criteria) this;
        }

        public Criteria andTermnameIn(List<String> values) {
            addCriterion("termname in", values, "termname");
            return (Criteria) this;
        }

        public Criteria andTermnameNotIn(List<String> values) {
            addCriterion("termname not in", values, "termname");
            return (Criteria) this;
        }

        public Criteria andTermnameBetween(String value1, String value2) {
            addCriterion("termname between", value1, value2, "termname");
            return (Criteria) this;
        }

        public Criteria andTermnameNotBetween(String value1, String value2) {
            addCriterion("termname not between", value1, value2, "termname");
            return (Criteria) this;
        }

        public Criteria andTermaddrIsNull() {
            addCriterion("termaddr is null");
            return (Criteria) this;
        }

        public Criteria andTermaddrIsNotNull() {
            addCriterion("termaddr is not null");
            return (Criteria) this;
        }

        public Criteria andTermaddrEqualTo(String value) {
            addCriterion("termaddr =", value, "termaddr");
            return (Criteria) this;
        }

        public Criteria andTermaddrNotEqualTo(String value) {
            addCriterion("termaddr <>", value, "termaddr");
            return (Criteria) this;
        }

        public Criteria andTermaddrGreaterThan(String value) {
            addCriterion("termaddr >", value, "termaddr");
            return (Criteria) this;
        }

        public Criteria andTermaddrGreaterThanOrEqualTo(String value) {
            addCriterion("termaddr >=", value, "termaddr");
            return (Criteria) this;
        }

        public Criteria andTermaddrLessThan(String value) {
            addCriterion("termaddr <", value, "termaddr");
            return (Criteria) this;
        }

        public Criteria andTermaddrLessThanOrEqualTo(String value) {
            addCriterion("termaddr <=", value, "termaddr");
            return (Criteria) this;
        }

        public Criteria andTermaddrLike(String value) {
            addCriterion("termaddr like", value, "termaddr");
            return (Criteria) this;
        }

        public Criteria andTermaddrNotLike(String value) {
            addCriterion("termaddr not like", value, "termaddr");
            return (Criteria) this;
        }

        public Criteria andTermaddrIn(List<String> values) {
            addCriterion("termaddr in", values, "termaddr");
            return (Criteria) this;
        }

        public Criteria andTermaddrNotIn(List<String> values) {
            addCriterion("termaddr not in", values, "termaddr");
            return (Criteria) this;
        }

        public Criteria andTermaddrBetween(String value1, String value2) {
            addCriterion("termaddr between", value1, value2, "termaddr");
            return (Criteria) this;
        }

        public Criteria andTermaddrNotBetween(String value1, String value2) {
            addCriterion("termaddr not between", value1, value2, "termaddr");
            return (Criteria) this;
        }

        public Criteria andDptcodeIsNull() {
            addCriterion("dptcode is null");
            return (Criteria) this;
        }

        public Criteria andDptcodeIsNotNull() {
            addCriterion("dptcode is not null");
            return (Criteria) this;
        }

        public Criteria andDptcodeEqualTo(String value) {
            addCriterion("dptcode =", value, "dptcode");
            return (Criteria) this;
        }

        public Criteria andDptcodeNotEqualTo(String value) {
            addCriterion("dptcode <>", value, "dptcode");
            return (Criteria) this;
        }

        public Criteria andDptcodeGreaterThan(String value) {
            addCriterion("dptcode >", value, "dptcode");
            return (Criteria) this;
        }

        public Criteria andDptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("dptcode >=", value, "dptcode");
            return (Criteria) this;
        }

        public Criteria andDptcodeLessThan(String value) {
            addCriterion("dptcode <", value, "dptcode");
            return (Criteria) this;
        }

        public Criteria andDptcodeLessThanOrEqualTo(String value) {
            addCriterion("dptcode <=", value, "dptcode");
            return (Criteria) this;
        }

        public Criteria andDptcodeLike(String value) {
            addCriterion("dptcode like", value, "dptcode");
            return (Criteria) this;
        }

        public Criteria andDptcodeNotLike(String value) {
            addCriterion("dptcode not like", value, "dptcode");
            return (Criteria) this;
        }

        public Criteria andDptcodeIn(List<String> values) {
            addCriterion("dptcode in", values, "dptcode");
            return (Criteria) this;
        }

        public Criteria andDptcodeNotIn(List<String> values) {
            addCriterion("dptcode not in", values, "dptcode");
            return (Criteria) this;
        }

        public Criteria andDptcodeBetween(String value1, String value2) {
            addCriterion("dptcode between", value1, value2, "dptcode");
            return (Criteria) this;
        }

        public Criteria andDptcodeNotBetween(String value1, String value2) {
            addCriterion("dptcode not between", value1, value2, "dptcode");
            return (Criteria) this;
        }

        public Criteria andAcccodeIsNull() {
            addCriterion("acccode is null");
            return (Criteria) this;
        }

        public Criteria andAcccodeIsNotNull() {
            addCriterion("acccode is not null");
            return (Criteria) this;
        }

        public Criteria andAcccodeEqualTo(String value) {
            addCriterion("acccode =", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeNotEqualTo(String value) {
            addCriterion("acccode <>", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeGreaterThan(String value) {
            addCriterion("acccode >", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeGreaterThanOrEqualTo(String value) {
            addCriterion("acccode >=", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeLessThan(String value) {
            addCriterion("acccode <", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeLessThanOrEqualTo(String value) {
            addCriterion("acccode <=", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeLike(String value) {
            addCriterion("acccode like", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeNotLike(String value) {
            addCriterion("acccode not like", value, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeIn(List<String> values) {
            addCriterion("acccode in", values, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeNotIn(List<String> values) {
            addCriterion("acccode not in", values, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeBetween(String value1, String value2) {
            addCriterion("acccode between", value1, value2, "acccode");
            return (Criteria) this;
        }

        public Criteria andAcccodeNotBetween(String value1, String value2) {
            addCriterion("acccode not between", value1, value2, "acccode");
            return (Criteria) this;
        }

        public Criteria andDscrpIsNull() {
            addCriterion("dscrp is null");
            return (Criteria) this;
        }

        public Criteria andDscrpIsNotNull() {
            addCriterion("dscrp is not null");
            return (Criteria) this;
        }

        public Criteria andDscrpEqualTo(String value) {
            addCriterion("dscrp =", value, "dscrp");
            return (Criteria) this;
        }

        public Criteria andDscrpNotEqualTo(String value) {
            addCriterion("dscrp <>", value, "dscrp");
            return (Criteria) this;
        }

        public Criteria andDscrpGreaterThan(String value) {
            addCriterion("dscrp >", value, "dscrp");
            return (Criteria) this;
        }

        public Criteria andDscrpGreaterThanOrEqualTo(String value) {
            addCriterion("dscrp >=", value, "dscrp");
            return (Criteria) this;
        }

        public Criteria andDscrpLessThan(String value) {
            addCriterion("dscrp <", value, "dscrp");
            return (Criteria) this;
        }

        public Criteria andDscrpLessThanOrEqualTo(String value) {
            addCriterion("dscrp <=", value, "dscrp");
            return (Criteria) this;
        }

        public Criteria andDscrpLike(String value) {
            addCriterion("dscrp like", value, "dscrp");
            return (Criteria) this;
        }

        public Criteria andDscrpNotLike(String value) {
            addCriterion("dscrp not like", value, "dscrp");
            return (Criteria) this;
        }

        public Criteria andDscrpIn(List<String> values) {
            addCriterion("dscrp in", values, "dscrp");
            return (Criteria) this;
        }

        public Criteria andDscrpNotIn(List<String> values) {
            addCriterion("dscrp not in", values, "dscrp");
            return (Criteria) this;
        }

        public Criteria andDscrpBetween(String value1, String value2) {
            addCriterion("dscrp between", value1, value2, "dscrp");
            return (Criteria) this;
        }

        public Criteria andDscrpNotBetween(String value1, String value2) {
            addCriterion("dscrp not between", value1, value2, "dscrp");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
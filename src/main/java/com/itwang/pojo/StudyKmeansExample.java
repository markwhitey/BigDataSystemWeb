package com.itwang.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudyKmeansExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudyKmeansExample() {
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

        public Criteria andOutidIsNull() {
            addCriterion("outid is null");
            return (Criteria) this;
        }

        public Criteria andOutidIsNotNull() {
            addCriterion("outid is not null");
            return (Criteria) this;
        }

        public Criteria andOutidEqualTo(String value) {
            addCriterion("outid =", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotEqualTo(String value) {
            addCriterion("outid <>", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidGreaterThan(String value) {
            addCriterion("outid >", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidGreaterThanOrEqualTo(String value) {
            addCriterion("outid >=", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLessThan(String value) {
            addCriterion("outid <", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLessThanOrEqualTo(String value) {
            addCriterion("outid <=", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidLike(String value) {
            addCriterion("outid like", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotLike(String value) {
            addCriterion("outid not like", value, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidIn(List<String> values) {
            addCriterion("outid in", values, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotIn(List<String> values) {
            addCriterion("outid not in", values, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidBetween(String value1, String value2) {
            addCriterion("outid between", value1, value2, "outid");
            return (Criteria) this;
        }

        public Criteria andOutidNotBetween(String value1, String value2) {
            addCriterion("outid not between", value1, value2, "outid");
            return (Criteria) this;
        }

        public Criteria andTotalBookIsNull() {
            addCriterion("total_book is null");
            return (Criteria) this;
        }

        public Criteria andTotalBookIsNotNull() {
            addCriterion("total_book is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBookEqualTo(Double value) {
            addCriterion("total_book =", value, "totalBook");
            return (Criteria) this;
        }

        public Criteria andTotalBookNotEqualTo(Double value) {
            addCriterion("total_book <>", value, "totalBook");
            return (Criteria) this;
        }

        public Criteria andTotalBookGreaterThan(Double value) {
            addCriterion("total_book >", value, "totalBook");
            return (Criteria) this;
        }

        public Criteria andTotalBookGreaterThanOrEqualTo(Double value) {
            addCriterion("total_book >=", value, "totalBook");
            return (Criteria) this;
        }

        public Criteria andTotalBookLessThan(Double value) {
            addCriterion("total_book <", value, "totalBook");
            return (Criteria) this;
        }

        public Criteria andTotalBookLessThanOrEqualTo(Double value) {
            addCriterion("total_book <=", value, "totalBook");
            return (Criteria) this;
        }

        public Criteria andTotalBookIn(List<Double> values) {
            addCriterion("total_book in", values, "totalBook");
            return (Criteria) this;
        }

        public Criteria andTotalBookNotIn(List<Double> values) {
            addCriterion("total_book not in", values, "totalBook");
            return (Criteria) this;
        }

        public Criteria andTotalBookBetween(Double value1, Double value2) {
            addCriterion("total_book between", value1, value2, "totalBook");
            return (Criteria) this;
        }

        public Criteria andTotalBookNotBetween(Double value1, Double value2) {
            addCriterion("total_book not between", value1, value2, "totalBook");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookIsNull() {
            addCriterion("frequency_book is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookIsNotNull() {
            addCriterion("frequency_book is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookEqualTo(Double value) {
            addCriterion("frequency_book =", value, "frequencyBook");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookNotEqualTo(Double value) {
            addCriterion("frequency_book <>", value, "frequencyBook");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookGreaterThan(Double value) {
            addCriterion("frequency_book >", value, "frequencyBook");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookGreaterThanOrEqualTo(Double value) {
            addCriterion("frequency_book >=", value, "frequencyBook");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookLessThan(Double value) {
            addCriterion("frequency_book <", value, "frequencyBook");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookLessThanOrEqualTo(Double value) {
            addCriterion("frequency_book <=", value, "frequencyBook");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookIn(List<Double> values) {
            addCriterion("frequency_book in", values, "frequencyBook");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookNotIn(List<Double> values) {
            addCriterion("frequency_book not in", values, "frequencyBook");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookBetween(Double value1, Double value2) {
            addCriterion("frequency_book between", value1, value2, "frequencyBook");
            return (Criteria) this;
        }

        public Criteria andFrequencyBookNotBetween(Double value1, Double value2) {
            addCriterion("frequency_book not between", value1, value2, "frequencyBook");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinIsNull() {
            addCriterion("frequency_menjin is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinIsNotNull() {
            addCriterion("frequency_menjin is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinEqualTo(Double value) {
            addCriterion("frequency_menjin =", value, "frequencyMenjin");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinNotEqualTo(Double value) {
            addCriterion("frequency_menjin <>", value, "frequencyMenjin");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinGreaterThan(Double value) {
            addCriterion("frequency_menjin >", value, "frequencyMenjin");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinGreaterThanOrEqualTo(Double value) {
            addCriterion("frequency_menjin >=", value, "frequencyMenjin");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinLessThan(Double value) {
            addCriterion("frequency_menjin <", value, "frequencyMenjin");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinLessThanOrEqualTo(Double value) {
            addCriterion("frequency_menjin <=", value, "frequencyMenjin");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinIn(List<Double> values) {
            addCriterion("frequency_menjin in", values, "frequencyMenjin");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinNotIn(List<Double> values) {
            addCriterion("frequency_menjin not in", values, "frequencyMenjin");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinBetween(Double value1, Double value2) {
            addCriterion("frequency_menjin between", value1, value2, "frequencyMenjin");
            return (Criteria) this;
        }

        public Criteria andFrequencyMenjinNotBetween(Double value1, Double value2) {
            addCriterion("frequency_menjin not between", value1, value2, "frequencyMenjin");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(Integer value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(Integer value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(Integer value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(Integer value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(Integer value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(Integer value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<Integer> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<Integer> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(Integer value1, Integer value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(Integer value1, Integer value2) {
            addCriterion("interest not between", value1, value2, "interest");
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
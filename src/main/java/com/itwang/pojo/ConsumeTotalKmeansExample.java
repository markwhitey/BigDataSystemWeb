package com.itwang.pojo;

import java.util.ArrayList;
import java.util.List;

public class ConsumeTotalKmeansExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsumeTotalKmeansExample() {
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

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Double value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Double value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Double value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Double value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Double value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Double> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Double> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Double value1, Double value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Double value1, Double value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyIsNull() {
            addCriterion("total_frequency is null");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyIsNotNull() {
            addCriterion("total_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyEqualTo(Double value) {
            addCriterion("total_frequency =", value, "totalFrequency");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyNotEqualTo(Double value) {
            addCriterion("total_frequency <>", value, "totalFrequency");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyGreaterThan(Double value) {
            addCriterion("total_frequency >", value, "totalFrequency");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyGreaterThanOrEqualTo(Double value) {
            addCriterion("total_frequency >=", value, "totalFrequency");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyLessThan(Double value) {
            addCriterion("total_frequency <", value, "totalFrequency");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyLessThanOrEqualTo(Double value) {
            addCriterion("total_frequency <=", value, "totalFrequency");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyIn(List<Double> values) {
            addCriterion("total_frequency in", values, "totalFrequency");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyNotIn(List<Double> values) {
            addCriterion("total_frequency not in", values, "totalFrequency");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyBetween(Double value1, Double value2) {
            addCriterion("total_frequency between", value1, value2, "totalFrequency");
            return (Criteria) this;
        }

        public Criteria andTotalFrequencyNotBetween(Double value1, Double value2) {
            addCriterion("total_frequency not between", value1, value2, "totalFrequency");
            return (Criteria) this;
        }

        public Criteria andClusterIsNull() {
            addCriterion("cluster is null");
            return (Criteria) this;
        }

        public Criteria andClusterIsNotNull() {
            addCriterion("cluster is not null");
            return (Criteria) this;
        }

        public Criteria andClusterEqualTo(Integer value) {
            addCriterion("cluster =", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterNotEqualTo(Integer value) {
            addCriterion("cluster <>", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterGreaterThan(Integer value) {
            addCriterion("cluster >", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterGreaterThanOrEqualTo(Integer value) {
            addCriterion("cluster >=", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterLessThan(Integer value) {
            addCriterion("cluster <", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterLessThanOrEqualTo(Integer value) {
            addCriterion("cluster <=", value, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterIn(List<Integer> values) {
            addCriterion("cluster in", values, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterNotIn(List<Integer> values) {
            addCriterion("cluster not in", values, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterBetween(Integer value1, Integer value2) {
            addCriterion("cluster between", value1, value2, "cluster");
            return (Criteria) this;
        }

        public Criteria andClusterNotBetween(Integer value1, Integer value2) {
            addCriterion("cluster not between", value1, value2, "cluster");
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
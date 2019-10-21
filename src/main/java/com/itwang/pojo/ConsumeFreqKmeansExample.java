package com.itwang.pojo;

import java.util.ArrayList;
import java.util.List;

public class ConsumeFreqKmeansExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsumeFreqKmeansExample() {
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

        public Criteria andBreakfastFreIsNull() {
            addCriterion("breakfast_fre is null");
            return (Criteria) this;
        }

        public Criteria andBreakfastFreIsNotNull() {
            addCriterion("breakfast_fre is not null");
            return (Criteria) this;
        }

        public Criteria andBreakfastFreEqualTo(Double value) {
            addCriterion("breakfast_fre =", value, "breakfastFre");
            return (Criteria) this;
        }

        public Criteria andBreakfastFreNotEqualTo(Double value) {
            addCriterion("breakfast_fre <>", value, "breakfastFre");
            return (Criteria) this;
        }

        public Criteria andBreakfastFreGreaterThan(Double value) {
            addCriterion("breakfast_fre >", value, "breakfastFre");
            return (Criteria) this;
        }

        public Criteria andBreakfastFreGreaterThanOrEqualTo(Double value) {
            addCriterion("breakfast_fre >=", value, "breakfastFre");
            return (Criteria) this;
        }

        public Criteria andBreakfastFreLessThan(Double value) {
            addCriterion("breakfast_fre <", value, "breakfastFre");
            return (Criteria) this;
        }

        public Criteria andBreakfastFreLessThanOrEqualTo(Double value) {
            addCriterion("breakfast_fre <=", value, "breakfastFre");
            return (Criteria) this;
        }

        public Criteria andBreakfastFreIn(List<Double> values) {
            addCriterion("breakfast_fre in", values, "breakfastFre");
            return (Criteria) this;
        }

        public Criteria andBreakfastFreNotIn(List<Double> values) {
            addCriterion("breakfast_fre not in", values, "breakfastFre");
            return (Criteria) this;
        }

        public Criteria andBreakfastFreBetween(Double value1, Double value2) {
            addCriterion("breakfast_fre between", value1, value2, "breakfastFre");
            return (Criteria) this;
        }

        public Criteria andBreakfastFreNotBetween(Double value1, Double value2) {
            addCriterion("breakfast_fre not between", value1, value2, "breakfastFre");
            return (Criteria) this;
        }

        public Criteria andLunchFreIsNull() {
            addCriterion("lunch_fre is null");
            return (Criteria) this;
        }

        public Criteria andLunchFreIsNotNull() {
            addCriterion("lunch_fre is not null");
            return (Criteria) this;
        }

        public Criteria andLunchFreEqualTo(Double value) {
            addCriterion("lunch_fre =", value, "lunchFre");
            return (Criteria) this;
        }

        public Criteria andLunchFreNotEqualTo(Double value) {
            addCriterion("lunch_fre <>", value, "lunchFre");
            return (Criteria) this;
        }

        public Criteria andLunchFreGreaterThan(Double value) {
            addCriterion("lunch_fre >", value, "lunchFre");
            return (Criteria) this;
        }

        public Criteria andLunchFreGreaterThanOrEqualTo(Double value) {
            addCriterion("lunch_fre >=", value, "lunchFre");
            return (Criteria) this;
        }

        public Criteria andLunchFreLessThan(Double value) {
            addCriterion("lunch_fre <", value, "lunchFre");
            return (Criteria) this;
        }

        public Criteria andLunchFreLessThanOrEqualTo(Double value) {
            addCriterion("lunch_fre <=", value, "lunchFre");
            return (Criteria) this;
        }

        public Criteria andLunchFreIn(List<Double> values) {
            addCriterion("lunch_fre in", values, "lunchFre");
            return (Criteria) this;
        }

        public Criteria andLunchFreNotIn(List<Double> values) {
            addCriterion("lunch_fre not in", values, "lunchFre");
            return (Criteria) this;
        }

        public Criteria andLunchFreBetween(Double value1, Double value2) {
            addCriterion("lunch_fre between", value1, value2, "lunchFre");
            return (Criteria) this;
        }

        public Criteria andLunchFreNotBetween(Double value1, Double value2) {
            addCriterion("lunch_fre not between", value1, value2, "lunchFre");
            return (Criteria) this;
        }

        public Criteria andDinnerFreIsNull() {
            addCriterion("dinner_fre is null");
            return (Criteria) this;
        }

        public Criteria andDinnerFreIsNotNull() {
            addCriterion("dinner_fre is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerFreEqualTo(Double value) {
            addCriterion("dinner_fre =", value, "dinnerFre");
            return (Criteria) this;
        }

        public Criteria andDinnerFreNotEqualTo(Double value) {
            addCriterion("dinner_fre <>", value, "dinnerFre");
            return (Criteria) this;
        }

        public Criteria andDinnerFreGreaterThan(Double value) {
            addCriterion("dinner_fre >", value, "dinnerFre");
            return (Criteria) this;
        }

        public Criteria andDinnerFreGreaterThanOrEqualTo(Double value) {
            addCriterion("dinner_fre >=", value, "dinnerFre");
            return (Criteria) this;
        }

        public Criteria andDinnerFreLessThan(Double value) {
            addCriterion("dinner_fre <", value, "dinnerFre");
            return (Criteria) this;
        }

        public Criteria andDinnerFreLessThanOrEqualTo(Double value) {
            addCriterion("dinner_fre <=", value, "dinnerFre");
            return (Criteria) this;
        }

        public Criteria andDinnerFreIn(List<Double> values) {
            addCriterion("dinner_fre in", values, "dinnerFre");
            return (Criteria) this;
        }

        public Criteria andDinnerFreNotIn(List<Double> values) {
            addCriterion("dinner_fre not in", values, "dinnerFre");
            return (Criteria) this;
        }

        public Criteria andDinnerFreBetween(Double value1, Double value2) {
            addCriterion("dinner_fre between", value1, value2, "dinnerFre");
            return (Criteria) this;
        }

        public Criteria andDinnerFreNotBetween(Double value1, Double value2) {
            addCriterion("dinner_fre not between", value1, value2, "dinnerFre");
            return (Criteria) this;
        }

        public Criteria andWaterFreIsNull() {
            addCriterion("water_fre is null");
            return (Criteria) this;
        }

        public Criteria andWaterFreIsNotNull() {
            addCriterion("water_fre is not null");
            return (Criteria) this;
        }

        public Criteria andWaterFreEqualTo(Double value) {
            addCriterion("water_fre =", value, "waterFre");
            return (Criteria) this;
        }

        public Criteria andWaterFreNotEqualTo(Double value) {
            addCriterion("water_fre <>", value, "waterFre");
            return (Criteria) this;
        }

        public Criteria andWaterFreGreaterThan(Double value) {
            addCriterion("water_fre >", value, "waterFre");
            return (Criteria) this;
        }

        public Criteria andWaterFreGreaterThanOrEqualTo(Double value) {
            addCriterion("water_fre >=", value, "waterFre");
            return (Criteria) this;
        }

        public Criteria andWaterFreLessThan(Double value) {
            addCriterion("water_fre <", value, "waterFre");
            return (Criteria) this;
        }

        public Criteria andWaterFreLessThanOrEqualTo(Double value) {
            addCriterion("water_fre <=", value, "waterFre");
            return (Criteria) this;
        }

        public Criteria andWaterFreIn(List<Double> values) {
            addCriterion("water_fre in", values, "waterFre");
            return (Criteria) this;
        }

        public Criteria andWaterFreNotIn(List<Double> values) {
            addCriterion("water_fre not in", values, "waterFre");
            return (Criteria) this;
        }

        public Criteria andWaterFreBetween(Double value1, Double value2) {
            addCriterion("water_fre between", value1, value2, "waterFre");
            return (Criteria) this;
        }

        public Criteria andWaterFreNotBetween(Double value1, Double value2) {
            addCriterion("water_fre not between", value1, value2, "waterFre");
            return (Criteria) this;
        }

        public Criteria andShoppingFreIsNull() {
            addCriterion("shopping_fre is null");
            return (Criteria) this;
        }

        public Criteria andShoppingFreIsNotNull() {
            addCriterion("shopping_fre is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingFreEqualTo(Double value) {
            addCriterion("shopping_fre =", value, "shoppingFre");
            return (Criteria) this;
        }

        public Criteria andShoppingFreNotEqualTo(Double value) {
            addCriterion("shopping_fre <>", value, "shoppingFre");
            return (Criteria) this;
        }

        public Criteria andShoppingFreGreaterThan(Double value) {
            addCriterion("shopping_fre >", value, "shoppingFre");
            return (Criteria) this;
        }

        public Criteria andShoppingFreGreaterThanOrEqualTo(Double value) {
            addCriterion("shopping_fre >=", value, "shoppingFre");
            return (Criteria) this;
        }

        public Criteria andShoppingFreLessThan(Double value) {
            addCriterion("shopping_fre <", value, "shoppingFre");
            return (Criteria) this;
        }

        public Criteria andShoppingFreLessThanOrEqualTo(Double value) {
            addCriterion("shopping_fre <=", value, "shoppingFre");
            return (Criteria) this;
        }

        public Criteria andShoppingFreIn(List<Double> values) {
            addCriterion("shopping_fre in", values, "shoppingFre");
            return (Criteria) this;
        }

        public Criteria andShoppingFreNotIn(List<Double> values) {
            addCriterion("shopping_fre not in", values, "shoppingFre");
            return (Criteria) this;
        }

        public Criteria andShoppingFreBetween(Double value1, Double value2) {
            addCriterion("shopping_fre between", value1, value2, "shoppingFre");
            return (Criteria) this;
        }

        public Criteria andShoppingFreNotBetween(Double value1, Double value2) {
            addCriterion("shopping_fre not between", value1, value2, "shoppingFre");
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
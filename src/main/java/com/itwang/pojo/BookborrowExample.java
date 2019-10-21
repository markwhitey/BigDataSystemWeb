package com.itwang.pojo;

import java.util.ArrayList;
import java.util.List;

public class BookborrowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookborrowExample() {
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

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(String value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(String value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(String value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(String value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(String value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(String value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLike(String value) {
            addCriterion("XH like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotLike(String value) {
            addCriterion("XH not like", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<String> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<String> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(String value1, String value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(String value1, String value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andXbmcIsNull() {
            addCriterion("XBMC is null");
            return (Criteria) this;
        }

        public Criteria andXbmcIsNotNull() {
            addCriterion("XBMC is not null");
            return (Criteria) this;
        }

        public Criteria andXbmcEqualTo(String value) {
            addCriterion("XBMC =", value, "xbmc");
            return (Criteria) this;
        }

        public Criteria andXbmcNotEqualTo(String value) {
            addCriterion("XBMC <>", value, "xbmc");
            return (Criteria) this;
        }

        public Criteria andXbmcGreaterThan(String value) {
            addCriterion("XBMC >", value, "xbmc");
            return (Criteria) this;
        }

        public Criteria andXbmcGreaterThanOrEqualTo(String value) {
            addCriterion("XBMC >=", value, "xbmc");
            return (Criteria) this;
        }

        public Criteria andXbmcLessThan(String value) {
            addCriterion("XBMC <", value, "xbmc");
            return (Criteria) this;
        }

        public Criteria andXbmcLessThanOrEqualTo(String value) {
            addCriterion("XBMC <=", value, "xbmc");
            return (Criteria) this;
        }

        public Criteria andXbmcLike(String value) {
            addCriterion("XBMC like", value, "xbmc");
            return (Criteria) this;
        }

        public Criteria andXbmcNotLike(String value) {
            addCriterion("XBMC not like", value, "xbmc");
            return (Criteria) this;
        }

        public Criteria andXbmcIn(List<String> values) {
            addCriterion("XBMC in", values, "xbmc");
            return (Criteria) this;
        }

        public Criteria andXbmcNotIn(List<String> values) {
            addCriterion("XBMC not in", values, "xbmc");
            return (Criteria) this;
        }

        public Criteria andXbmcBetween(String value1, String value2) {
            addCriterion("XBMC between", value1, value2, "xbmc");
            return (Criteria) this;
        }

        public Criteria andXbmcNotBetween(String value1, String value2) {
            addCriterion("XBMC not between", value1, value2, "xbmc");
            return (Criteria) this;
        }

        public Criteria andDwmcIsNull() {
            addCriterion("DWMC is null");
            return (Criteria) this;
        }

        public Criteria andDwmcIsNotNull() {
            addCriterion("DWMC is not null");
            return (Criteria) this;
        }

        public Criteria andDwmcEqualTo(String value) {
            addCriterion("DWMC =", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotEqualTo(String value) {
            addCriterion("DWMC <>", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcGreaterThan(String value) {
            addCriterion("DWMC >", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcGreaterThanOrEqualTo(String value) {
            addCriterion("DWMC >=", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLessThan(String value) {
            addCriterion("DWMC <", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLessThanOrEqualTo(String value) {
            addCriterion("DWMC <=", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcLike(String value) {
            addCriterion("DWMC like", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotLike(String value) {
            addCriterion("DWMC not like", value, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcIn(List<String> values) {
            addCriterion("DWMC in", values, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotIn(List<String> values) {
            addCriterion("DWMC not in", values, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcBetween(String value1, String value2) {
            addCriterion("DWMC between", value1, value2, "dwmc");
            return (Criteria) this;
        }

        public Criteria andDwmcNotBetween(String value1, String value2) {
            addCriterion("DWMC not between", value1, value2, "dwmc");
            return (Criteria) this;
        }

        public Criteria andTsmcIsNull() {
            addCriterion("TSMC is null");
            return (Criteria) this;
        }

        public Criteria andTsmcIsNotNull() {
            addCriterion("TSMC is not null");
            return (Criteria) this;
        }

        public Criteria andTsmcEqualTo(String value) {
            addCriterion("TSMC =", value, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTsmcNotEqualTo(String value) {
            addCriterion("TSMC <>", value, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTsmcGreaterThan(String value) {
            addCriterion("TSMC >", value, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTsmcGreaterThanOrEqualTo(String value) {
            addCriterion("TSMC >=", value, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTsmcLessThan(String value) {
            addCriterion("TSMC <", value, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTsmcLessThanOrEqualTo(String value) {
            addCriterion("TSMC <=", value, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTsmcLike(String value) {
            addCriterion("TSMC like", value, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTsmcNotLike(String value) {
            addCriterion("TSMC not like", value, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTsmcIn(List<String> values) {
            addCriterion("TSMC in", values, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTsmcNotIn(List<String> values) {
            addCriterion("TSMC not in", values, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTsmcBetween(String value1, String value2) {
            addCriterion("TSMC between", value1, value2, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTsmcNotBetween(String value1, String value2) {
            addCriterion("TSMC not between", value1, value2, "tsmc");
            return (Criteria) this;
        }

        public Criteria andTslbIsNull() {
            addCriterion("TSLB is null");
            return (Criteria) this;
        }

        public Criteria andTslbIsNotNull() {
            addCriterion("TSLB is not null");
            return (Criteria) this;
        }

        public Criteria andTslbEqualTo(String value) {
            addCriterion("TSLB =", value, "tslb");
            return (Criteria) this;
        }

        public Criteria andTslbNotEqualTo(String value) {
            addCriterion("TSLB <>", value, "tslb");
            return (Criteria) this;
        }

        public Criteria andTslbGreaterThan(String value) {
            addCriterion("TSLB >", value, "tslb");
            return (Criteria) this;
        }

        public Criteria andTslbGreaterThanOrEqualTo(String value) {
            addCriterion("TSLB >=", value, "tslb");
            return (Criteria) this;
        }

        public Criteria andTslbLessThan(String value) {
            addCriterion("TSLB <", value, "tslb");
            return (Criteria) this;
        }

        public Criteria andTslbLessThanOrEqualTo(String value) {
            addCriterion("TSLB <=", value, "tslb");
            return (Criteria) this;
        }

        public Criteria andTslbLike(String value) {
            addCriterion("TSLB like", value, "tslb");
            return (Criteria) this;
        }

        public Criteria andTslbNotLike(String value) {
            addCriterion("TSLB not like", value, "tslb");
            return (Criteria) this;
        }

        public Criteria andTslbIn(List<String> values) {
            addCriterion("TSLB in", values, "tslb");
            return (Criteria) this;
        }

        public Criteria andTslbNotIn(List<String> values) {
            addCriterion("TSLB not in", values, "tslb");
            return (Criteria) this;
        }

        public Criteria andTslbBetween(String value1, String value2) {
            addCriterion("TSLB between", value1, value2, "tslb");
            return (Criteria) this;
        }

        public Criteria andTslbNotBetween(String value1, String value2) {
            addCriterion("TSLB not between", value1, value2, "tslb");
            return (Criteria) this;
        }

        public Criteria andFlh1IsNull() {
            addCriterion("FLH1 is null");
            return (Criteria) this;
        }

        public Criteria andFlh1IsNotNull() {
            addCriterion("FLH1 is not null");
            return (Criteria) this;
        }

        public Criteria andFlh1EqualTo(String value) {
            addCriterion("FLH1 =", value, "flh1");
            return (Criteria) this;
        }

        public Criteria andFlh1NotEqualTo(String value) {
            addCriterion("FLH1 <>", value, "flh1");
            return (Criteria) this;
        }

        public Criteria andFlh1GreaterThan(String value) {
            addCriterion("FLH1 >", value, "flh1");
            return (Criteria) this;
        }

        public Criteria andFlh1GreaterThanOrEqualTo(String value) {
            addCriterion("FLH1 >=", value, "flh1");
            return (Criteria) this;
        }

        public Criteria andFlh1LessThan(String value) {
            addCriterion("FLH1 <", value, "flh1");
            return (Criteria) this;
        }

        public Criteria andFlh1LessThanOrEqualTo(String value) {
            addCriterion("FLH1 <=", value, "flh1");
            return (Criteria) this;
        }

        public Criteria andFlh1Like(String value) {
            addCriterion("FLH1 like", value, "flh1");
            return (Criteria) this;
        }

        public Criteria andFlh1NotLike(String value) {
            addCriterion("FLH1 not like", value, "flh1");
            return (Criteria) this;
        }

        public Criteria andFlh1In(List<String> values) {
            addCriterion("FLH1 in", values, "flh1");
            return (Criteria) this;
        }

        public Criteria andFlh1NotIn(List<String> values) {
            addCriterion("FLH1 not in", values, "flh1");
            return (Criteria) this;
        }

        public Criteria andFlh1Between(String value1, String value2) {
            addCriterion("FLH1 between", value1, value2, "flh1");
            return (Criteria) this;
        }

        public Criteria andFlh1NotBetween(String value1, String value2) {
            addCriterion("FLH1 not between", value1, value2, "flh1");
            return (Criteria) this;
        }

        public Criteria andJhsjIsNull() {
            addCriterion("JHSJ is null");
            return (Criteria) this;
        }

        public Criteria andJhsjIsNotNull() {
            addCriterion("JHSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJhsjEqualTo(String value) {
            addCriterion("JHSJ =", value, "jhsj");
            return (Criteria) this;
        }

        public Criteria andJhsjNotEqualTo(String value) {
            addCriterion("JHSJ <>", value, "jhsj");
            return (Criteria) this;
        }

        public Criteria andJhsjGreaterThan(String value) {
            addCriterion("JHSJ >", value, "jhsj");
            return (Criteria) this;
        }

        public Criteria andJhsjGreaterThanOrEqualTo(String value) {
            addCriterion("JHSJ >=", value, "jhsj");
            return (Criteria) this;
        }

        public Criteria andJhsjLessThan(String value) {
            addCriterion("JHSJ <", value, "jhsj");
            return (Criteria) this;
        }

        public Criteria andJhsjLessThanOrEqualTo(String value) {
            addCriterion("JHSJ <=", value, "jhsj");
            return (Criteria) this;
        }

        public Criteria andJhsjLike(String value) {
            addCriterion("JHSJ like", value, "jhsj");
            return (Criteria) this;
        }

        public Criteria andJhsjNotLike(String value) {
            addCriterion("JHSJ not like", value, "jhsj");
            return (Criteria) this;
        }

        public Criteria andJhsjIn(List<String> values) {
            addCriterion("JHSJ in", values, "jhsj");
            return (Criteria) this;
        }

        public Criteria andJhsjNotIn(List<String> values) {
            addCriterion("JHSJ not in", values, "jhsj");
            return (Criteria) this;
        }

        public Criteria andJhsjBetween(String value1, String value2) {
            addCriterion("JHSJ between", value1, value2, "jhsj");
            return (Criteria) this;
        }

        public Criteria andJhsjNotBetween(String value1, String value2) {
            addCriterion("JHSJ not between", value1, value2, "jhsj");
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
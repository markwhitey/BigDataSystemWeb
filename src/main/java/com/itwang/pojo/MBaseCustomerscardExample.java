package com.itwang.pojo;

import java.util.ArrayList;
import java.util.List;

public class MBaseCustomerscardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MBaseCustomerscardExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNull() {
            addCriterion("customerid is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridIsNotNull() {
            addCriterion("customerid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridEqualTo(String value) {
            addCriterion("customerid =", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotEqualTo(String value) {
            addCriterion("customerid <>", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThan(String value) {
            addCriterion("customerid >", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridGreaterThanOrEqualTo(String value) {
            addCriterion("customerid >=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThan(String value) {
            addCriterion("customerid <", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLessThanOrEqualTo(String value) {
            addCriterion("customerid <=", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridLike(String value) {
            addCriterion("customerid like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotLike(String value) {
            addCriterion("customerid not like", value, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridIn(List<String> values) {
            addCriterion("customerid in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotIn(List<String> values) {
            addCriterion("customerid not in", values, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridBetween(String value1, String value2) {
            addCriterion("customerid between", value1, value2, "customerid");
            return (Criteria) this;
        }

        public Criteria andCustomeridNotBetween(String value1, String value2) {
            addCriterion("customerid not between", value1, value2, "customerid");
            return (Criteria) this;
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

        public Criteria andCardsnIsNull() {
            addCriterion("cardsn is null");
            return (Criteria) this;
        }

        public Criteria andCardsnIsNotNull() {
            addCriterion("cardsn is not null");
            return (Criteria) this;
        }

        public Criteria andCardsnEqualTo(String value) {
            addCriterion("cardsn =", value, "cardsn");
            return (Criteria) this;
        }

        public Criteria andCardsnNotEqualTo(String value) {
            addCriterion("cardsn <>", value, "cardsn");
            return (Criteria) this;
        }

        public Criteria andCardsnGreaterThan(String value) {
            addCriterion("cardsn >", value, "cardsn");
            return (Criteria) this;
        }

        public Criteria andCardsnGreaterThanOrEqualTo(String value) {
            addCriterion("cardsn >=", value, "cardsn");
            return (Criteria) this;
        }

        public Criteria andCardsnLessThan(String value) {
            addCriterion("cardsn <", value, "cardsn");
            return (Criteria) this;
        }

        public Criteria andCardsnLessThanOrEqualTo(String value) {
            addCriterion("cardsn <=", value, "cardsn");
            return (Criteria) this;
        }

        public Criteria andCardsnLike(String value) {
            addCriterion("cardsn like", value, "cardsn");
            return (Criteria) this;
        }

        public Criteria andCardsnNotLike(String value) {
            addCriterion("cardsn not like", value, "cardsn");
            return (Criteria) this;
        }

        public Criteria andCardsnIn(List<String> values) {
            addCriterion("cardsn in", values, "cardsn");
            return (Criteria) this;
        }

        public Criteria andCardsnNotIn(List<String> values) {
            addCriterion("cardsn not in", values, "cardsn");
            return (Criteria) this;
        }

        public Criteria andCardsnBetween(String value1, String value2) {
            addCriterion("cardsn between", value1, value2, "cardsn");
            return (Criteria) this;
        }

        public Criteria andCardsnNotBetween(String value1, String value2) {
            addCriterion("cardsn not between", value1, value2, "cardsn");
            return (Criteria) this;
        }

        public Criteria andScardsnrIsNull() {
            addCriterion("scardsnr is null");
            return (Criteria) this;
        }

        public Criteria andScardsnrIsNotNull() {
            addCriterion("scardsnr is not null");
            return (Criteria) this;
        }

        public Criteria andScardsnrEqualTo(String value) {
            addCriterion("scardsnr =", value, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andScardsnrNotEqualTo(String value) {
            addCriterion("scardsnr <>", value, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andScardsnrGreaterThan(String value) {
            addCriterion("scardsnr >", value, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andScardsnrGreaterThanOrEqualTo(String value) {
            addCriterion("scardsnr >=", value, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andScardsnrLessThan(String value) {
            addCriterion("scardsnr <", value, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andScardsnrLessThanOrEqualTo(String value) {
            addCriterion("scardsnr <=", value, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andScardsnrLike(String value) {
            addCriterion("scardsnr like", value, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andScardsnrNotLike(String value) {
            addCriterion("scardsnr not like", value, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andScardsnrIn(List<String> values) {
            addCriterion("scardsnr in", values, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andScardsnrNotIn(List<String> values) {
            addCriterion("scardsnr not in", values, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andScardsnrBetween(String value1, String value2) {
            addCriterion("scardsnr between", value1, value2, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andScardsnrNotBetween(String value1, String value2) {
            addCriterion("scardsnr not between", value1, value2, "scardsnr");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAsnIsNull() {
            addCriterion("asn is null");
            return (Criteria) this;
        }

        public Criteria andAsnIsNotNull() {
            addCriterion("asn is not null");
            return (Criteria) this;
        }

        public Criteria andAsnEqualTo(String value) {
            addCriterion("asn =", value, "asn");
            return (Criteria) this;
        }

        public Criteria andAsnNotEqualTo(String value) {
            addCriterion("asn <>", value, "asn");
            return (Criteria) this;
        }

        public Criteria andAsnGreaterThan(String value) {
            addCriterion("asn >", value, "asn");
            return (Criteria) this;
        }

        public Criteria andAsnGreaterThanOrEqualTo(String value) {
            addCriterion("asn >=", value, "asn");
            return (Criteria) this;
        }

        public Criteria andAsnLessThan(String value) {
            addCriterion("asn <", value, "asn");
            return (Criteria) this;
        }

        public Criteria andAsnLessThanOrEqualTo(String value) {
            addCriterion("asn <=", value, "asn");
            return (Criteria) this;
        }

        public Criteria andAsnLike(String value) {
            addCriterion("asn like", value, "asn");
            return (Criteria) this;
        }

        public Criteria andAsnNotLike(String value) {
            addCriterion("asn not like", value, "asn");
            return (Criteria) this;
        }

        public Criteria andAsnIn(List<String> values) {
            addCriterion("asn in", values, "asn");
            return (Criteria) this;
        }

        public Criteria andAsnNotIn(List<String> values) {
            addCriterion("asn not in", values, "asn");
            return (Criteria) this;
        }

        public Criteria andAsnBetween(String value1, String value2) {
            addCriterion("asn between", value1, value2, "asn");
            return (Criteria) this;
        }

        public Criteria andAsnNotBetween(String value1, String value2) {
            addCriterion("asn not between", value1, value2, "asn");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOddfareIsNull() {
            addCriterion("oddfare is null");
            return (Criteria) this;
        }

        public Criteria andOddfareIsNotNull() {
            addCriterion("oddfare is not null");
            return (Criteria) this;
        }

        public Criteria andOddfareEqualTo(String value) {
            addCriterion("oddfare =", value, "oddfare");
            return (Criteria) this;
        }

        public Criteria andOddfareNotEqualTo(String value) {
            addCriterion("oddfare <>", value, "oddfare");
            return (Criteria) this;
        }

        public Criteria andOddfareGreaterThan(String value) {
            addCriterion("oddfare >", value, "oddfare");
            return (Criteria) this;
        }

        public Criteria andOddfareGreaterThanOrEqualTo(String value) {
            addCriterion("oddfare >=", value, "oddfare");
            return (Criteria) this;
        }

        public Criteria andOddfareLessThan(String value) {
            addCriterion("oddfare <", value, "oddfare");
            return (Criteria) this;
        }

        public Criteria andOddfareLessThanOrEqualTo(String value) {
            addCriterion("oddfare <=", value, "oddfare");
            return (Criteria) this;
        }

        public Criteria andOddfareLike(String value) {
            addCriterion("oddfare like", value, "oddfare");
            return (Criteria) this;
        }

        public Criteria andOddfareNotLike(String value) {
            addCriterion("oddfare not like", value, "oddfare");
            return (Criteria) this;
        }

        public Criteria andOddfareIn(List<String> values) {
            addCriterion("oddfare in", values, "oddfare");
            return (Criteria) this;
        }

        public Criteria andOddfareNotIn(List<String> values) {
            addCriterion("oddfare not in", values, "oddfare");
            return (Criteria) this;
        }

        public Criteria andOddfareBetween(String value1, String value2) {
            addCriterion("oddfare between", value1, value2, "oddfare");
            return (Criteria) this;
        }

        public Criteria andOddfareNotBetween(String value1, String value2) {
            addCriterion("oddfare not between", value1, value2, "oddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareIsNull() {
            addCriterion("suboddfare is null");
            return (Criteria) this;
        }

        public Criteria andSuboddfareIsNotNull() {
            addCriterion("suboddfare is not null");
            return (Criteria) this;
        }

        public Criteria andSuboddfareEqualTo(String value) {
            addCriterion("suboddfare =", value, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareNotEqualTo(String value) {
            addCriterion("suboddfare <>", value, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareGreaterThan(String value) {
            addCriterion("suboddfare >", value, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareGreaterThanOrEqualTo(String value) {
            addCriterion("suboddfare >=", value, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareLessThan(String value) {
            addCriterion("suboddfare <", value, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareLessThanOrEqualTo(String value) {
            addCriterion("suboddfare <=", value, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareLike(String value) {
            addCriterion("suboddfare like", value, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareNotLike(String value) {
            addCriterion("suboddfare not like", value, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareIn(List<String> values) {
            addCriterion("suboddfare in", values, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareNotIn(List<String> values) {
            addCriterion("suboddfare not in", values, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareBetween(String value1, String value2) {
            addCriterion("suboddfare between", value1, value2, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andSuboddfareNotBetween(String value1, String value2) {
            addCriterion("suboddfare not between", value1, value2, "suboddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareIsNull() {
            addCriterion("onlineoddfare is null");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareIsNotNull() {
            addCriterion("onlineoddfare is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareEqualTo(String value) {
            addCriterion("onlineoddfare =", value, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareNotEqualTo(String value) {
            addCriterion("onlineoddfare <>", value, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareGreaterThan(String value) {
            addCriterion("onlineoddfare >", value, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareGreaterThanOrEqualTo(String value) {
            addCriterion("onlineoddfare >=", value, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareLessThan(String value) {
            addCriterion("onlineoddfare <", value, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareLessThanOrEqualTo(String value) {
            addCriterion("onlineoddfare <=", value, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareLike(String value) {
            addCriterion("onlineoddfare like", value, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareNotLike(String value) {
            addCriterion("onlineoddfare not like", value, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareIn(List<String> values) {
            addCriterion("onlineoddfare in", values, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareNotIn(List<String> values) {
            addCriterion("onlineoddfare not in", values, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareBetween(String value1, String value2) {
            addCriterion("onlineoddfare between", value1, value2, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andOnlineoddfareNotBetween(String value1, String value2) {
            addCriterion("onlineoddfare not between", value1, value2, "onlineoddfare");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNull() {
            addCriterion("cardtype is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("cardtype is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(String value) {
            addCriterion("cardtype =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(String value) {
            addCriterion("cardtype <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(String value) {
            addCriterion("cardtype >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("cardtype >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(String value) {
            addCriterion("cardtype <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(String value) {
            addCriterion("cardtype <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLike(String value) {
            addCriterion("cardtype like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotLike(String value) {
            addCriterion("cardtype not like", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<String> values) {
            addCriterion("cardtype in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<String> values) {
            addCriterion("cardtype not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(String value1, String value2) {
            addCriterion("cardtype between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(String value1, String value2) {
            addCriterion("cardtype not between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNull() {
            addCriterion("idcardno is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIsNotNull() {
            addCriterion("idcardno is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnoEqualTo(String value) {
            addCriterion("idcardno =", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotEqualTo(String value) {
            addCriterion("idcardno <>", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThan(String value) {
            addCriterion("idcardno >", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("idcardno >=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThan(String value) {
            addCriterion("idcardno <", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLessThanOrEqualTo(String value) {
            addCriterion("idcardno <=", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoLike(String value) {
            addCriterion("idcardno like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotLike(String value) {
            addCriterion("idcardno not like", value, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoIn(List<String> values) {
            addCriterion("idcardno in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotIn(List<String> values) {
            addCriterion("idcardno not in", values, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoBetween(String value1, String value2) {
            addCriterion("idcardno between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andIdcardnoNotBetween(String value1, String value2) {
            addCriterion("idcardno not between", value1, value2, "idcardno");
            return (Criteria) this;
        }

        public Criteria andCustdeptIsNull() {
            addCriterion("custdept is null");
            return (Criteria) this;
        }

        public Criteria andCustdeptIsNotNull() {
            addCriterion("custdept is not null");
            return (Criteria) this;
        }

        public Criteria andCustdeptEqualTo(String value) {
            addCriterion("custdept =", value, "custdept");
            return (Criteria) this;
        }

        public Criteria andCustdeptNotEqualTo(String value) {
            addCriterion("custdept <>", value, "custdept");
            return (Criteria) this;
        }

        public Criteria andCustdeptGreaterThan(String value) {
            addCriterion("custdept >", value, "custdept");
            return (Criteria) this;
        }

        public Criteria andCustdeptGreaterThanOrEqualTo(String value) {
            addCriterion("custdept >=", value, "custdept");
            return (Criteria) this;
        }

        public Criteria andCustdeptLessThan(String value) {
            addCriterion("custdept <", value, "custdept");
            return (Criteria) this;
        }

        public Criteria andCustdeptLessThanOrEqualTo(String value) {
            addCriterion("custdept <=", value, "custdept");
            return (Criteria) this;
        }

        public Criteria andCustdeptLike(String value) {
            addCriterion("custdept like", value, "custdept");
            return (Criteria) this;
        }

        public Criteria andCustdeptNotLike(String value) {
            addCriterion("custdept not like", value, "custdept");
            return (Criteria) this;
        }

        public Criteria andCustdeptIn(List<String> values) {
            addCriterion("custdept in", values, "custdept");
            return (Criteria) this;
        }

        public Criteria andCustdeptNotIn(List<String> values) {
            addCriterion("custdept not in", values, "custdept");
            return (Criteria) this;
        }

        public Criteria andCustdeptBetween(String value1, String value2) {
            addCriterion("custdept between", value1, value2, "custdept");
            return (Criteria) this;
        }

        public Criteria andCustdeptNotBetween(String value1, String value2) {
            addCriterion("custdept not between", value1, value2, "custdept");
            return (Criteria) this;
        }

        public Criteria andDpfullnameIsNull() {
            addCriterion("dpfullname is null");
            return (Criteria) this;
        }

        public Criteria andDpfullnameIsNotNull() {
            addCriterion("dpfullname is not null");
            return (Criteria) this;
        }

        public Criteria andDpfullnameEqualTo(String value) {
            addCriterion("dpfullname =", value, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andDpfullnameNotEqualTo(String value) {
            addCriterion("dpfullname <>", value, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andDpfullnameGreaterThan(String value) {
            addCriterion("dpfullname >", value, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andDpfullnameGreaterThanOrEqualTo(String value) {
            addCriterion("dpfullname >=", value, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andDpfullnameLessThan(String value) {
            addCriterion("dpfullname <", value, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andDpfullnameLessThanOrEqualTo(String value) {
            addCriterion("dpfullname <=", value, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andDpfullnameLike(String value) {
            addCriterion("dpfullname like", value, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andDpfullnameNotLike(String value) {
            addCriterion("dpfullname not like", value, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andDpfullnameIn(List<String> values) {
            addCriterion("dpfullname in", values, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andDpfullnameNotIn(List<String> values) {
            addCriterion("dpfullname not in", values, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andDpfullnameBetween(String value1, String value2) {
            addCriterion("dpfullname between", value1, value2, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andDpfullnameNotBetween(String value1, String value2) {
            addCriterion("dpfullname not between", value1, value2, "dpfullname");
            return (Criteria) this;
        }

        public Criteria andCardtypenameIsNull() {
            addCriterion("cardtypename is null");
            return (Criteria) this;
        }

        public Criteria andCardtypenameIsNotNull() {
            addCriterion("cardtypename is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypenameEqualTo(String value) {
            addCriterion("cardtypename =", value, "cardtypename");
            return (Criteria) this;
        }

        public Criteria andCardtypenameNotEqualTo(String value) {
            addCriterion("cardtypename <>", value, "cardtypename");
            return (Criteria) this;
        }

        public Criteria andCardtypenameGreaterThan(String value) {
            addCriterion("cardtypename >", value, "cardtypename");
            return (Criteria) this;
        }

        public Criteria andCardtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("cardtypename >=", value, "cardtypename");
            return (Criteria) this;
        }

        public Criteria andCardtypenameLessThan(String value) {
            addCriterion("cardtypename <", value, "cardtypename");
            return (Criteria) this;
        }

        public Criteria andCardtypenameLessThanOrEqualTo(String value) {
            addCriterion("cardtypename <=", value, "cardtypename");
            return (Criteria) this;
        }

        public Criteria andCardtypenameLike(String value) {
            addCriterion("cardtypename like", value, "cardtypename");
            return (Criteria) this;
        }

        public Criteria andCardtypenameNotLike(String value) {
            addCriterion("cardtypename not like", value, "cardtypename");
            return (Criteria) this;
        }

        public Criteria andCardtypenameIn(List<String> values) {
            addCriterion("cardtypename in", values, "cardtypename");
            return (Criteria) this;
        }

        public Criteria andCardtypenameNotIn(List<String> values) {
            addCriterion("cardtypename not in", values, "cardtypename");
            return (Criteria) this;
        }

        public Criteria andCardtypenameBetween(String value1, String value2) {
            addCriterion("cardtypename between", value1, value2, "cardtypename");
            return (Criteria) this;
        }

        public Criteria andCardtypenameNotBetween(String value1, String value2) {
            addCriterion("cardtypename not between", value1, value2, "cardtypename");
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
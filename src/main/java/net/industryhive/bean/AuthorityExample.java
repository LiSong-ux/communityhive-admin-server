package net.industryhive.bean;

import java.util.ArrayList;
import java.util.List;

public class AuthorityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBanaccountIsNull() {
            addCriterion("banAccount is null");
            return (Criteria) this;
        }

        public Criteria andBanaccountIsNotNull() {
            addCriterion("banAccount is not null");
            return (Criteria) this;
        }

        public Criteria andBanaccountEqualTo(Boolean value) {
            addCriterion("banAccount =", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountNotEqualTo(Boolean value) {
            addCriterion("banAccount <>", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountGreaterThan(Boolean value) {
            addCriterion("banAccount >", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banAccount >=", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountLessThan(Boolean value) {
            addCriterion("banAccount <", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountLessThanOrEqualTo(Boolean value) {
            addCriterion("banAccount <=", value, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountIn(List<Boolean> values) {
            addCriterion("banAccount in", values, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountNotIn(List<Boolean> values) {
            addCriterion("banAccount not in", values, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountBetween(Boolean value1, Boolean value2) {
            addCriterion("banAccount between", value1, value2, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBanaccountNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banAccount not between", value1, value2, "banaccount");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicIsNull() {
            addCriterion("banSubmitTopic is null");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicIsNotNull() {
            addCriterion("banSubmitTopic is not null");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicEqualTo(Boolean value) {
            addCriterion("banSubmitTopic =", value, "bansubmittopic");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicNotEqualTo(Boolean value) {
            addCriterion("banSubmitTopic <>", value, "bansubmittopic");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicGreaterThan(Boolean value) {
            addCriterion("banSubmitTopic >", value, "bansubmittopic");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banSubmitTopic >=", value, "bansubmittopic");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicLessThan(Boolean value) {
            addCriterion("banSubmitTopic <", value, "bansubmittopic");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicLessThanOrEqualTo(Boolean value) {
            addCriterion("banSubmitTopic <=", value, "bansubmittopic");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicIn(List<Boolean> values) {
            addCriterion("banSubmitTopic in", values, "bansubmittopic");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicNotIn(List<Boolean> values) {
            addCriterion("banSubmitTopic not in", values, "bansubmittopic");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicBetween(Boolean value1, Boolean value2) {
            addCriterion("banSubmitTopic between", value1, value2, "bansubmittopic");
            return (Criteria) this;
        }

        public Criteria andBansubmittopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banSubmitTopic not between", value1, value2, "bansubmittopic");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyIsNull() {
            addCriterion("banSubmitReply is null");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyIsNotNull() {
            addCriterion("banSubmitReply is not null");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyEqualTo(Boolean value) {
            addCriterion("banSubmitReply =", value, "bansubmitreply");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyNotEqualTo(Boolean value) {
            addCriterion("banSubmitReply <>", value, "bansubmitreply");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyGreaterThan(Boolean value) {
            addCriterion("banSubmitReply >", value, "bansubmitreply");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banSubmitReply >=", value, "bansubmitreply");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyLessThan(Boolean value) {
            addCriterion("banSubmitReply <", value, "bansubmitreply");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyLessThanOrEqualTo(Boolean value) {
            addCriterion("banSubmitReply <=", value, "bansubmitreply");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyIn(List<Boolean> values) {
            addCriterion("banSubmitReply in", values, "bansubmitreply");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyNotIn(List<Boolean> values) {
            addCriterion("banSubmitReply not in", values, "bansubmitreply");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyBetween(Boolean value1, Boolean value2) {
            addCriterion("banSubmitReply between", value1, value2, "bansubmitreply");
            return (Criteria) this;
        }

        public Criteria andBansubmitreplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banSubmitReply not between", value1, value2, "bansubmitreply");
            return (Criteria) this;
        }

        public Criteria andBanmessageIsNull() {
            addCriterion("banMessage is null");
            return (Criteria) this;
        }

        public Criteria andBanmessageIsNotNull() {
            addCriterion("banMessage is not null");
            return (Criteria) this;
        }

        public Criteria andBanmessageEqualTo(Boolean value) {
            addCriterion("banMessage =", value, "banmessage");
            return (Criteria) this;
        }

        public Criteria andBanmessageNotEqualTo(Boolean value) {
            addCriterion("banMessage <>", value, "banmessage");
            return (Criteria) this;
        }

        public Criteria andBanmessageGreaterThan(Boolean value) {
            addCriterion("banMessage >", value, "banmessage");
            return (Criteria) this;
        }

        public Criteria andBanmessageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("banMessage >=", value, "banmessage");
            return (Criteria) this;
        }

        public Criteria andBanmessageLessThan(Boolean value) {
            addCriterion("banMessage <", value, "banmessage");
            return (Criteria) this;
        }

        public Criteria andBanmessageLessThanOrEqualTo(Boolean value) {
            addCriterion("banMessage <=", value, "banmessage");
            return (Criteria) this;
        }

        public Criteria andBanmessageIn(List<Boolean> values) {
            addCriterion("banMessage in", values, "banmessage");
            return (Criteria) this;
        }

        public Criteria andBanmessageNotIn(List<Boolean> values) {
            addCriterion("banMessage not in", values, "banmessage");
            return (Criteria) this;
        }

        public Criteria andBanmessageBetween(Boolean value1, Boolean value2) {
            addCriterion("banMessage between", value1, value2, "banmessage");
            return (Criteria) this;
        }

        public Criteria andBanmessageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("banMessage not between", value1, value2, "banmessage");
            return (Criteria) this;
        }

        public Criteria andDeletetopicIsNull() {
            addCriterion("deleteTopic is null");
            return (Criteria) this;
        }

        public Criteria andDeletetopicIsNotNull() {
            addCriterion("deleteTopic is not null");
            return (Criteria) this;
        }

        public Criteria andDeletetopicEqualTo(Boolean value) {
            addCriterion("deleteTopic =", value, "deletetopic");
            return (Criteria) this;
        }

        public Criteria andDeletetopicNotEqualTo(Boolean value) {
            addCriterion("deleteTopic <>", value, "deletetopic");
            return (Criteria) this;
        }

        public Criteria andDeletetopicGreaterThan(Boolean value) {
            addCriterion("deleteTopic >", value, "deletetopic");
            return (Criteria) this;
        }

        public Criteria andDeletetopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteTopic >=", value, "deletetopic");
            return (Criteria) this;
        }

        public Criteria andDeletetopicLessThan(Boolean value) {
            addCriterion("deleteTopic <", value, "deletetopic");
            return (Criteria) this;
        }

        public Criteria andDeletetopicLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteTopic <=", value, "deletetopic");
            return (Criteria) this;
        }

        public Criteria andDeletetopicIn(List<Boolean> values) {
            addCriterion("deleteTopic in", values, "deletetopic");
            return (Criteria) this;
        }

        public Criteria andDeletetopicNotIn(List<Boolean> values) {
            addCriterion("deleteTopic not in", values, "deletetopic");
            return (Criteria) this;
        }

        public Criteria andDeletetopicBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteTopic between", value1, value2, "deletetopic");
            return (Criteria) this;
        }

        public Criteria andDeletetopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteTopic not between", value1, value2, "deletetopic");
            return (Criteria) this;
        }

        public Criteria andDeletereplyIsNull() {
            addCriterion("deleteReply is null");
            return (Criteria) this;
        }

        public Criteria andDeletereplyIsNotNull() {
            addCriterion("deleteReply is not null");
            return (Criteria) this;
        }

        public Criteria andDeletereplyEqualTo(Boolean value) {
            addCriterion("deleteReply =", value, "deletereply");
            return (Criteria) this;
        }

        public Criteria andDeletereplyNotEqualTo(Boolean value) {
            addCriterion("deleteReply <>", value, "deletereply");
            return (Criteria) this;
        }

        public Criteria andDeletereplyGreaterThan(Boolean value) {
            addCriterion("deleteReply >", value, "deletereply");
            return (Criteria) this;
        }

        public Criteria andDeletereplyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleteReply >=", value, "deletereply");
            return (Criteria) this;
        }

        public Criteria andDeletereplyLessThan(Boolean value) {
            addCriterion("deleteReply <", value, "deletereply");
            return (Criteria) this;
        }

        public Criteria andDeletereplyLessThanOrEqualTo(Boolean value) {
            addCriterion("deleteReply <=", value, "deletereply");
            return (Criteria) this;
        }

        public Criteria andDeletereplyIn(List<Boolean> values) {
            addCriterion("deleteReply in", values, "deletereply");
            return (Criteria) this;
        }

        public Criteria andDeletereplyNotIn(List<Boolean> values) {
            addCriterion("deleteReply not in", values, "deletereply");
            return (Criteria) this;
        }

        public Criteria andDeletereplyBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteReply between", value1, value2, "deletereply");
            return (Criteria) this;
        }

        public Criteria andDeletereplyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleteReply not between", value1, value2, "deletereply");
            return (Criteria) this;
        }

        public Criteria andLocktopicIsNull() {
            addCriterion("lockTopic is null");
            return (Criteria) this;
        }

        public Criteria andLocktopicIsNotNull() {
            addCriterion("lockTopic is not null");
            return (Criteria) this;
        }

        public Criteria andLocktopicEqualTo(Boolean value) {
            addCriterion("lockTopic =", value, "locktopic");
            return (Criteria) this;
        }

        public Criteria andLocktopicNotEqualTo(Boolean value) {
            addCriterion("lockTopic <>", value, "locktopic");
            return (Criteria) this;
        }

        public Criteria andLocktopicGreaterThan(Boolean value) {
            addCriterion("lockTopic >", value, "locktopic");
            return (Criteria) this;
        }

        public Criteria andLocktopicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lockTopic >=", value, "locktopic");
            return (Criteria) this;
        }

        public Criteria andLocktopicLessThan(Boolean value) {
            addCriterion("lockTopic <", value, "locktopic");
            return (Criteria) this;
        }

        public Criteria andLocktopicLessThanOrEqualTo(Boolean value) {
            addCriterion("lockTopic <=", value, "locktopic");
            return (Criteria) this;
        }

        public Criteria andLocktopicIn(List<Boolean> values) {
            addCriterion("lockTopic in", values, "locktopic");
            return (Criteria) this;
        }

        public Criteria andLocktopicNotIn(List<Boolean> values) {
            addCriterion("lockTopic not in", values, "locktopic");
            return (Criteria) this;
        }

        public Criteria andLocktopicBetween(Boolean value1, Boolean value2) {
            addCriterion("lockTopic between", value1, value2, "locktopic");
            return (Criteria) this;
        }

        public Criteria andLocktopicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lockTopic not between", value1, value2, "locktopic");
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
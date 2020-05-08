
var questionList = {
		template:'\
			<div>\
				<div v-for="question in questions">\
					<div>\
						<div class = "question">Question : {{question.question}}</div>\
					</div>\
					<div v-for="answer in question.answerList" style = "margin-left: 20px">\
						<input type = "radio" :name="question.q_id">{{answer.answer}}\</input>\
					</div>\
				</div>\
			</div>\
			',
		props:['questions'],
};

var result = new Vue({
	el: '#result',
	data: {
		questions :[],
	},
	components: {
		'test-component' : questionList
	},
	methods:{
		initData : function(){
			var self = this;

			axios({
				method: 'get',
				url: '/question/getAllQuestion'
			})
			.then (data => {
				self.questions  = data.data;
				console.log(self.questions);
			})
			
		}
	},
	created: function(){
		this.initData();
	}
	
})
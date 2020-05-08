var candidateVue = new Vue({
	el : "#candidate",
	data : {
		candidateName : "",
	},

	methods : {
		redirect : function() {
			var self = this;
			
			var url = "/result";
			window.location = url;
		},

	},
	

})
var Website = {
	run: function(){
		oScroll1 = $('#scrollbar1');
		if(oScroll1.length > 0){
			oScroll1.tinyscrollbar();
			//oScroll1.data("plugin_tinyscrollbar").update("relative");  
		}
		
	}
};
//Initialize
$(document).ready(function(){
	Website.run();
});
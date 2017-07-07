;(function($,win,doc,unde){
	$.fn.pageFun = function(options){
		var defaults = {
			pageDiv   : $(this).find(".pageDiv"),
			pageDivLi : $(this).find(".pageDiv li"),
			page      : $(this).find(".page"),
			pageMenu  : $(this).find(".pageMenu"),
			pageMenuLi: $(this).find(".pageDiv li"),
			firstPage : $(this).find(".firstPage"),
			prevPage  : $(this).find(".prevPage"),
			pageNum   : $(this).find(".pageNum"),
			nextPage  : $(this).find(".nextPage"),
			pageObj   : $(this).find(".pageObj"),
			pageObjLi : $(this).find(".pageObj li"),
			lastPage  : $(this).find(".lastPage"),
            keuInput  : $(this).find(".keuInput"),
            btnSure   : $(this).find(".btnSure"),
			notContent: $(this).find(".notContent"),
			totalPage : $(this).find(".totalPage"),
			pNum      : 1,
			lastNum   : 0,
			cacheNum  : 1,
			min       : 0,
			res       :null
		};
		var opts = $.extend({},defaults,options);

		var Method = {
			init : function(){
				Method.getData(); /* 请求接口获得数据 */
				Method.handleEvent(); /* 事件处理 */
			},
			getData : function(){
				        opts.pNum = opts.pages;
						if(opts.pageNum == 1){
							 opts.firstPage.addClass("disabled");
							 opts.prevPage.addClass("disabled");
							 opts.lastPage.removeClass("disabled");
							 opts.nextPage.removeClass("disabled");
		                   if (opts.pNum == 1) {
		                     	 opts.lastPage.addClass("disabled");
								 opts.nextPage.addClass("disabled");
		                   };
						}else if(opts.pageNum == opts.pNum){
							 opts.firstPage.removeClass("disabled");
							 opts.prevPage.removeClass("disabled");
							 opts.lastPage.addClass("disabled");
							 opts.nextPage.addClass("disabled");
						}else{
							 opts.firstPage.removeClass("disabled");
							 opts.prevPage.removeClass("disabled");
							 opts.lastPage.removeClass("disabled");
							 opts.nextPage.removeClass("disabled");
						}

                        for (var i = 0; i < opts.pNum; i++) {
                            opts.pageObj.append(opts.pageFun(i+1));
                        }
                        
						opts.pageObj.find("li").eq(opts.pageNum-1).addClass("active");
                        opts.totalPage.text(opts.pNum);
                        
                        Method.xhhtml(opts.pageNum, null);
                        Method.showPageindex(0, opts.maxPage, opts.pageNum);
			},
			handleEvent : function(){
				opts.pageObj.on("click","li",function(){  /* 点击页码切换 */
					Method.submitForm($(this).text());
				});

				opts.prevPage.on("click",function(){ /* 点击上页 */
					var num = opts.pageNum - 1;
					Method.submitForm(num);
				});

				opts.nextPage.on("click",function(){  /* 点击下页 */
					var num = opts.pageNum + 1;
					Method.submitForm(num);
				});

				opts.firstPage.on("click",function(){   /* 点击首页 */
					Method.submitForm(1);
				});

				opts.lastPage.on("click",function(){  /* 点击尾页 */
					Method.submitForm(opts.pNum);
				});

				opts.btnSure.on("click",function(){   /* 输入页码 跳转 */
                    var val = opts.keuInput.val();
                    if((val == "")||val<=0){
                    	opts.keuInput.val(1);
                    	alert("请输入有效页码");
                        return;
                    }

                    if((Number(val)>opts.pNum)){
                    	alert('共'+opts.pNum+'页');
                        return;
                    }
                    Method.submitForm(val);
                });
			},
			xhhtml : function(index,count){
                opts.keuInput.val(index);
			},
			showPageindex : function(min, max, index) {
                if (index <= Math.ceil(max / 2)) {
                    min = 0;
                    max = max;
                }else if (opts.pNum - index < Math.ceil(max / 2)) {
                    min = opts.pNum - max;
                    max = opts.pNum ;
                }else {
                    min = Math.round(index - max / 2)-1;
                    max = Math.round(Number(index) + Number(max / 2))-1;
                }
                
                $(".pageObj li").hide();
                for (var i = min; i < max; i++) {
                    $(".pageObj li").eq(i).show();
                }
            },
            submitForm : function(pageNum){
            	$("#"+opts.inpNum).val(pageNum);
            	$("#"+opts.formName).submit();
            }
		}
		Method.init();
	}
})(jQuery,window,document,undefined)


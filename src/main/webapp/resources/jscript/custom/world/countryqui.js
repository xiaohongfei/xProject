var grid = null;
function initComplete() {
	grid = $("#dataBasic").quiGrid({
				columns : [
					{display : '编码', name : 'code', width : "15%"},
					{display : '名称', name : 'name', width : "20%"},
					{display : '大陆', name : 'continent', width : "20%"},
					{display : '区域', name : 'region', width : "20%"},
					{display : '面积', name : 'surfacearea', width : "15%"}
				],
				title : '测试表头',
				url : '/country/findCountryList1',
				rownumbers : true,
				checkbox : true,
				height : '100%',
				width : '100%',
				usePager : true,
				page : 1,
				pageSize : 10,
				percentWidthMode : true
			});
}
$(function() {

	$('#gridReport01').datagrid({
		method: 'post',
		url: '/country/findCountryList',
		rownumbers: true,
		autoRowHeight: false,
		border: false,
		fit: true, 
		fitColumns: true,
		striped: true,
		pagination: true,
		columns: [[
	        {field: 'id', hidden: true},
	        {field: 'code', title: '编码', width: 100, align: 'center'},
	        {field: 'name', title: '名称', width: 100, align: 'center'},
	        {field: 'continent', title: '大陆', width: 100, align: 'center'},
	        {field: 'region', title: '区域', width: 100, align: 'center'},   
	        {field: 'surfacearea', title: '面积', width: 100, align: 'center'} 
		]]
	});

});

function test() {
	$.post("/thymeleaf/findCountryList", { page: 1, rows: 10 },
			function(data){
				alert("Data Loaded: " + data);
				alert(data.rows)
				alert(data.total)
	});
}
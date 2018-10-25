(function() {
	var path, match;
	var scripts = document.getElementsByTagName('script');
	for (i = 0, ln = scripts.length; i < ln; i++) {
		scriptSrc = scripts[i].src;
		match = scriptSrc.match(/common\.js$/);
		if (match) {
			path = scriptSrc.substring(0, scriptSrc.length - match[0].length - 9);
			break;
		}
	}

	/* easyui 样式表 */
	document.write('<link href="' + path + '/css/common.css" rel="stylesheet" type="text/css"/>');
	document.write('<link href="' + path + '/css/vtip.css" rel="stylesheet" type="text/css"/>');
	document.write('<link href="' + path + '/jscript/plugin/easyui1.5.5.7/themes/bootstrap/easyui.css" rel="stylesheet" type="text/css"/>');
	document.write('<link href="' + path + '/jscript/plugin/easyui1.5.5.7/themes/icon.css" rel="stylesheet" type="text/css"/>');
	document.write('<link href="' + path + '/jscript/plugin/easyui1.5.5.7/themes/color.css" rel="stylesheet" type="text/css"/>');
	/* easyui 主脚本*/
	document.write('<script type="text/javascript" src="' + path + '/jscript/plugin/easyui1.5.5.7/jquery.min.js"></script>');
	document.write('<script type="text/javascript" src="' + path + '/jscript/plugin/easyui1.5.5.7/jquery.easyui.min.js"></script>');
	document.write('<script type="text/javascript" src="' + path + '/jscript/plugin/easyui1.5.5.7/locale/easyui-lang-zh_CN.js"></script>');
	/* echarts 主脚本 */
	document.write('<script type="text/javascript" src="' + path + '/jscript/plugin/echarts4.1.0/echarts.min.js"></script>');
	/*拼音*/
	document.write('<script type="text/javascript" src="' + path + '/jscript/plugin/ChinesePY.js"></script>');
	document.write('<script type="text/javascript" src="' + path + '/jscript/plugin/vtip-min.js"></script>');
})();

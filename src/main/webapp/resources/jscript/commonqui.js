(function() {
	var path, match;
	var scripts = document.getElementsByTagName('script');
	for (i = 0, ln = scripts.length; i < ln; i++) {
		scriptSrc = scripts[i].src;
		match = scriptSrc.match(/commonqui\.js$/);
		if (match) {
			path = scriptSrc.substring(0, scriptSrc.length - match[0].length - 9);
			break;
		}
	}

	/* easyui 样式表 */
	document.write('<link href="' + path + '/jscript/plugin/qui3.3.0/libs/css/import_basic.css" rel="stylesheet" type="text/css"/>');
	document.write('<link href="' + path + '/jscript/plugin/qui3.3.0/libs/skins/red/style.css" rel="stylesheet" type="text/css"/>');
	/* easyui 主脚本*/
	document.write('<script type="text/javascript" src="' + path + '/jscript/plugin/qui3.3.0/libs/js/jquery.js"></script>');
	document.write('<script type="text/javascript" src="' + path + '/jscript/plugin/qui3.3.0/libs/js/language/cn.js"></script>');
	document.write('<script type="text/javascript" src="' + path + '/jscript/plugin/qui3.3.0/libs/js/framework.js"></script>');
	document.write('<script type="text/javascript" src="' + path + '/jscript/plugin/qui3.3.0/libs/js/main.js"></script>');
	document.write('<script type="text/javascript" src="' + path + '/jscript/plugin/qui3.3.0/libs/js/table/quiGrid.js"></script>');
})();

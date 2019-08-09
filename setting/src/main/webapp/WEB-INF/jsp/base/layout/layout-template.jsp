<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/include/taglib.jsp"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>GN:project-1</title>
    <!-- meta -->
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, minimum-scale=1, user-scalable=no, minimal-ui, viewport-fit=cover">
    
    <!-- css -->
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.7/css/all.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.rawgit.com/ax5ui/ax5ui-kernel/master/dist/ax5ui.all.css"> 
    <link rel="stylesheet" href="<c:url value='resources/css/reset.css'/>">
    <link rel="stylesheet" href="<c:url value='resources/css/common.css'/>">
    <link rel="stylesheet" href="<c:url value='resources/css/main.css'/>">
    
    
    <!--  JS -->
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script> 
    <script type="text/javascript" src="https://cdn.rawgit.com/ax5ui/ax5ui-kernel/master/dist/ax5ui.all.min.js"></script>
    
</head>
<style>
	
	
</style>
<body>
    <div style="width:100vw; height:100vh;">
    	
    	<!-- HEADER -->
	    <div class="layout-header">
		    <tiles:insertAttribute name="header" />
	    </div>
	    
	    <!-- BODY -->
	    <div class="layout-contents">
	    	<div class = "lnb">
	    		<tiles:insertAttribute name="left" />
	    	</div>
	    	<div class = "content">
	    		<tiles:insertAttribute name="body" />
	    	</div>
	   	</div>
	   	    
   	    <!-- FOOTER -->
	    <div class="layout-footer">
	    	<tiles:insertAttribute name="footer" />
	   	</div>
	   	
    </div>
</body>
</html>
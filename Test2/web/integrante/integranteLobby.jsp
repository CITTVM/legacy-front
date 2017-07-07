
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard - Integrante</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="assets/dashboard/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="assets/dashboard/font-awesome/css/font-awesome.min.css" />
    <link rel="stylesheet" type="text/css" href="assets/dashboard/css/local.css" />

    <script type="text/javascript" src="assets/dashboard/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="assets/dashboard/bootstrap/js/bootstrap.min.js"></script>
    <!-- you need to include the shieldui css and js assets in order for the charts to work -->
    <link rel="stylesheet" type="text/css" href="http://www.shieldui.com/shared/components/latest/css/light-bootstrap/all.min.css" />
    <link id="gridcss" rel="stylesheet" type="text/css" href="http://www.shieldui.com/shared/components/latest/css/dark-bootstrap/all.min.css" />

    <script type="text/javascript" src="http://www.shieldui.com/shared/components/latest/js/shieldui-all.min.js"></script>
    <script type="text/javascript" src="http://www.prepbootstrap.com/Content/js/gridData.js"></script>
</head>
<body>
    <div id="wrapper"style="margin-top: 30px;">
          <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="integranteLobby.jsp">Admin Panel</a>
            </div>
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul id="active" class="nav navbar-nav side-nav">
                    <li class="selected"><a href="integranteLobby.jsp"><i class="fa fa-home"></i> Lobby</a></li>
                    <li><a href="https://taiga.io/"><i class="fa fa-bullseye"></i> Taiga</a></li>
                    <li><a href="https://gogs.io/"><i class="fa fa-tasks"></i> Gogs</a></li>
                    <li><a href="misProductos.jsp"><i class="fa fa-area-chart"></i> Mis Productos</a></li>
                     <li><a href="misWorkshops.jsp"><i class="fa fa-globe"></i> Mis Workshops</a></li>
                     <li><a href="../noticias.jsp"><i class="fa fa-globe"></i> Noticias</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right navbar-user">
                    <li class="dropdown user-dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> <c:out value="${sessionScope.usuarioActivo.getNickname()}" /><b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#"><i class="fa fa-user"></i> Perfil</a></li>
                            <li class="divider"></li>
                            <li><a href="#"><i class="fa fa-power-off"></i> Log Out</a></li>

                        </ul>
                    </li>
                </ul>
            </div>
        </nav>
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1>Lobby <small>Tu punto de inicio</small></h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-8">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title"><i class="fa fa-calendar"></i> Calendario</h3>
                        </div>
                             <div id="calendar" class="calendar"></div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title"><i class="fa fa-rss"></i> Twitter</h3>
                        </div>
                        <div class="panel-body feed">
                            <a class="twitter-timeline" data-width="400" data-height="400" data-theme="dark" href="https://twitter.com/CITTDuocUC">Tweets by CITTDuocUC</a> <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- /#wrapper -->
    <script type="text/javascript">
        jQuery(function ($) {
            var performance = [12, 43, 34, 22, 12, 33, 4, 17, 22, 34, 54, 67],
                visits = [123, 323, 443, 32],
                traffic = [
                {
                    Source: "Direct", Amount: 323, Change: 53, Percent: 23, Target: 600
                },
                {
                    Source: "Refer", Amount: 345, Change: 34, Percent: 45, Target: 567
                },
                {
                    Source: "Social", Amount: 567, Change: 67, Percent: 23, Target: 456
                },
                {
                    Source: "Search", Amount: 234, Change: 23, Percent: 56, Target: 890
                },
                {
                    Source: "Internal", Amount: 111, Change: 78, Percent: 12, Target: 345
                }];


            $("#shieldui-chart1").shieldChart({
                theme: "dark",

                primaryHeader: {
                    text: "Visitors"
                },
                exportOptions: {
                    image: false,
                    print: false
                },
                dataSeries: [{
                    seriesType: "area",
                    collectionAlias: "Q Data",
                    data: performance
                }]
            });

            $("#shieldui-chart2").shieldChart({
                theme: "dark",
                primaryHeader: {
                    text: "Traffic Per week"
                },
                exportOptions: {
                    image: false,
                    print: false
                },
                dataSeries: [{
                    seriesType: "pie",
                    collectionAlias: "traffic",
                    data: visits
                }]
            });

            $("#shieldui-grid1").shieldGrid({
                dataSource: {
                    data: traffic
                },
                sorting: {
                    multiple: true
                },
                rowHover: false,
                paging: false,
                columns: [
                { field: "Source", width: "170px", title: "Source" },
                { field: "Amount", title: "Amount" },                
                { field: "Percent", title: "Percent", format: "{0} %" },
                { field: "Target", title: "Target" },
                ]
            });            
        });        
    </script>
    <script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>
    <script type="text/javascript">
    jQuery(function ($) {
        $("#calendar").shieldCalendar({
            footer: {
                enabled: true,
                footerTemlpate: "{0:dd.MM.yy}"
            },
            min: new Date("2009/2/23"),
            max: new Date("2039/3/1"),
            value: new Date()
        });
    });
</script>
<style>
    .calendar
    {
        width: 700px;
        margin-top: 3px;
        margin-left: 3px;
    }
</style>
<script>
    twttr.widgets.createTimeline(
  {
    sourceType: "list",
    ownerScreenName: "TwitterDev"
  },
  document.getElementById("container")
);
</script>
</body>
</html>

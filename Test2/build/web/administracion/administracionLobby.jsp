
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard - Administracion</title>
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
    <div id="wrapper">
          <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="integranteLobby.html">Lobby Legacy</a>
            </div>
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul id="active" class="nav navbar-nav side-nav">
                    <li class="selected"><a href="administracionLobby.html"><i class="fa fa-home"></i> Lobby</a></li>
                    <li><a href="https://taiga.io/"><i class="fa fa-bullseye"></i> Taiga</a></li>
                    <li><a href="https://gogs.io/"><i class="fa fa-tasks"></i> Gogs</a></li>
                    <li><a href="portfolio.html"><i class="fa fa-area-chart"></i> Proyectos</a></li>
                     <li><a href=""><i class="fa fa-globe"></i> Workshops</a></li>
                     <li><a href=""><i class="fa fa-globe"></i> Noticias</a></li>
                      <li><a href=""><i class="fa fa-globe"></i> Inventario</a></li>
                     
                </ul>
                <ul class="nav navbar-nav navbar-right navbar-user">
                    <li class="dropdown user-dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> {User_name}<b class="caret"></b></a>
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
                    <h1>Lobby <small>/ Administracion</small></h1>
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
    <!-- /#wrapper -->
    <script type="text/javascript">

    jQuery(function ($) {
        $("#calendar").shieldCalendar({
            footer: {
                enabled: true,
                footerTemlpate: "{0:dd/MMMM/yyyy HH:MM}"
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

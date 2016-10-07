<!DOCTYPE html>
<html>
<head>
  <#include "header.ftl">
</head>

<body>

  <#include "nav.ftl">

<div class="jumbotron text-center">
  <div class="container">
    <a href="/" class="lang-logo">
      <img src="/lang-logo.png">
    </a>
    <h1>Hey dunoooooooo...............!!!</h1>
    <p>Please go through following apps......</p>
     <a type="button" class="btn btn-lg btn-primary" href="/index.html"> Tracing Motion </a>
     <a type="button" class="btn btn-lg btn-primary" href="/videoplayer.html"> Video Player </a>
  </div>
</div>
<div class="container">
  <div class="alert alert-info text-center" role="alert">
    how is it.....?
  </div>
  <hr>
  <div class="row">
    <div class="col-md-6">
      <h3><span class="glyphicon glyphicon-info-sign"></span> How this sample app works</h3>
      <ul>
        <li>This app was deployed to Heroku, either using Git or by using <a href="https://github.com/heroku/java-getting-started">Heroku Button</a> on the repository.</li>

        <li>When Heroku received the source code, it fetched all the dependencies in the <a href="https://github.com/heroku/java-getting-started/blob/master/pom.xml">pom.xml</a>, creating a slug.</li>
        <li>The platform then spins up a dyno, a lightweight container that provides an isolated environment in which the slug can be mounted and executed.</li>
        <li>You can scale your app, manage it, and deploy over <a href="https://addons.heroku.com/">150 add-on services</a>, from the Dashboard or CLI.</li>
      </ul>
    </div>
    <div class="col-md-6">
      <h3><span class="glyphicon glyphicon-link"></span> Next Steps</h3>
      <ul>
        <li>If you are following the <a href="https://devcenter.heroku.com/articles/getting-started-with-java">Getting Started</a> guide, then please head back to the tutorial and follow the next steps!</li>
        <li>If you deployed this app by deploying the Heroku Button, then in a command line shell, run:</li>
        <ul>
          <li><code>git clone https://github.com/heroku/java-getting-started.git</code> - this will create a local copy of the source code for the app</li>
          <li><code>cd java-getting-started</code> - change directory into the local source code repository</li>
          <li><code>heroku git:remote -a &lt;your-app-name></code> - associate the Heroku app with the repository</li>
          <li>You'll now be set up to run the app locally, or <a href="https://devcenter.heroku.com/articles/getting-started-with-java#push-local-changes">deploy changes</a> to Heroku</li>
        </ul>
      </ul>
      <h3><span class="glyphicon glyphicon-link"></span> Helpful Links</h3>
      <ul>
        <li><a href="https://www.heroku.com/home">Heroku</a></li>
        <li><a href="https://devcenter.heroku.com/">Heroku Dev Center</a></li>
        <li><a href="https://devcenter.heroku.com/articles/getting-started-with-java">Getting Started with Java on Heroku</a></li>
        <li><a href="https://devcenter.heroku.com/articles/deploying-java">Deploying Java Apps on Heroku</a></li>
      </ul>
    </div>
  </div> <!-- row -->
   <div class="alert alert-info text-center" role="alert">
    Please do work through the Getting Started guide, even if you do know how to build such an application.  The guide covers the basics of working with Heroku, and will familiarize you with all the concepts you need in order to build and deploy your own apps.
  </div>
</div>


</body>
</html>
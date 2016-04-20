Need run the rabbitmq before all the application service run.

Pushed build rabbitmq centos7 docker image to https://hub.docker.com/r/janezhango/rabbitmq/

1. Run RabbitMQ sbin command prompt as administrator.
2. Run "rabbitmq-service remove"
3. Run "rabbitmq-service install"
4. Enable admin module "rabbitmq-plugins enable rabbitmq_management"
5. Goto admin console and add the 'job-queue' to make modules work

echo "Stopping all jar"
pid = `ps -ef | grep jenkins-example.jar | grep -v grep | awk '{print $2}'`
if [ -n "$pid" ]

then

  echo "kill -9 pid:" $pid

  kill -9 $pid

fi
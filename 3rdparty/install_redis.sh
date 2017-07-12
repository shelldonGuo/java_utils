REDIS_DIR="/home/work/soft/redis"
REDIS_CONF=${REDIS_DIR}"/conf"

if [ ! -d $REDIS_CONF ];then
    mkdir -p $REDIS_CONF
fi

tar xzf redis-2.8.5_tcmalloc.tar.gz &&
cd redis-2.8.5_tcmalloc &&
make PREFIX=$REDIS_DIR USE_TCMALLOC=yes install &&
cp redis.conf $REDIS_CONF

if [ "$?" != "0" ];then
    echo "install redis fail"
    exit -1
fi

cd -

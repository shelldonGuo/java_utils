#!/bin/bash

function gfComplete(){
    cd gf-complete &&
    make clean &&
    ./configure --prefix=/home/work/soft/gf-complete/ LIBS=-ltcmalloc &&
    make && make install
    if [ "$?" != "0" ];then
        echo "install gfComplete failed"
        exit -1
    fi
    cd -
}


function jerasure(){
    cd jerasure &&
    make clean &&
    ./configure --prefix=/home/work/soft/jerasure LDFLAGS=-L/home/work/soft/gf-complete/lib CPPFLAGS=-I/home/work/soft/gf-complete/include  LIBS=-ltcmalloc &&
    make && make install
    if [ "$?" != "0" ];then
        echo "install jerasure failed"
        exit -1
    fi
    cd -
}

tar xzf jerasure.tar.gz &&
cd jerasure

gfComplete
jerasure


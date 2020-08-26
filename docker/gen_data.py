#!/bin/python2
with open("/tmp/my-data/tmp_data", "w") as f:
    for i in xrange(100):
        line = "key{}:val{}\n".format(i,i)
        f.write(line)

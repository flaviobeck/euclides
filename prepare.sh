cd target/pit-reports/
cd $(ls -d */|head -n 1)
cp *.xml ../../
cd ../../../
python parsing.py

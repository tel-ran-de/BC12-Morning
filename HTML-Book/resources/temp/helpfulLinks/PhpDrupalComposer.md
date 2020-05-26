git commit -m "everything too late day"

drush sql-cli < ~/domains/abnehmen-zuhause.com/newdb/abnehmen.sql

drush sql-dump > ~/domains/secretstyle.biz/180620secret.sql
drush sql-dump > ~/domains-de/andron13.de/182206andron13.sql

drush pm-list --type=module --status=enabled | sed '/\((.*)\)/!d;/[Cc]ore.*-.*[Rr]equired/d;s/.*(\(.*\)).*/\1/' | sort > noncoremod.txt



drush pm-enable $(cat noncoremod.txt)
/home/andron13/domains-de/andron13.de

drush sql-dump --gzip > ~/domains/ei.by/18061ei4by.sql.gz

drush sql-dump --gzip > ~/domains/call.by/180613callby.sql.gz

drush sql-dump> ~/domains/ei.by/18061ei4by.sql.


http://linuxcmd.ru/kak-uznat-razmer-papki-v-linux


drush sql-cli < ~/domains/dsl.by/180613dslby.sql.gz

git commit -m "update на д7 прошёл вроде ок"

composer create-project drupal-composer/drupal-project:8.x-dev some-dir --stability dev --no-interaction

""
composer create-project drupal-composer/drupal-project:8.x-dev drupal8forei --stability dev --no-interaction



drush sql-cli < ~/sites/vgomele.by/web/180627vgomele.sql
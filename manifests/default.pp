$override_options = {
  'mysqld' => {
    'bind-address' => '0.0.0.0',
    'skip-external-locking' => undef
  }
}

class { '::mysql::server':
  root_password           => 'root',
  remove_default_accounts => true,
  override_options        => $override_options
}

mysql::db { 'mapvenliquibase':
  user     => 'mapvenliquiuser',
  password => 'mapvenliquipass',
  host     => '%',
  grant    => ['ALL']
}

mysql::db { 'mapvenPROD':
  user     => 'mapvenuserPROD',
  password => 'mapvenpassPROD',
  host     => '%',
  grant    => ['ALL']
}


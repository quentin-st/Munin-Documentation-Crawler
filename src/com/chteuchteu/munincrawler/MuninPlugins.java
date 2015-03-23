package com.chteuchteu.munincrawler;

public class MuninPlugins {
    /**
     * List of known plugins
     */
	public static String[] muninPlugins = {
		"if1sec_eth0",
		"if1sec_lo",
		"multicpu1sec",
		"apache_accesses",
		"apache_processes",
		"apache_volume",
		"diskstats_iops",
		"diskstats_latency",
		"df",
		"df_abs",
		"df_inode",
		"iostat_ios",
		"iostat",
		"diskstats_throughput",
		"diskstats_utilization",
		"github_contrib",
		"github_munin",
		"accounts",
		"sshguard2",
		"users",
		"muninlogs",
		"munin_stats",
		"munin_update",
		"pluginsizes",
		"fw_conntrack",
		"fw_packets",
		"http_loadtime",
		"fw_forwarded_local",
		"netstat",
		"virtualwebhosts",
		"ip_127_0_0_1",
		"ip_176_9_109_75",
		"traffic",
		"threads",
		"processes",
		"proc_pri",
		"vmstat",
		"entropy",
		"cpu",
		"open_files",
		"forks",
		"irqstats",
		"open_inodes",
		"interrupts",
		"load",
		"load_extended",
		"memory",
		"memsimple",
		"installed",
		"packages",
		"swap",
		"uptime",
		"ntp_kernel_err",
		"ntp_kernel_pll_freq",
		"ntp_kernel_pll_off",
		"newntp_hora_cs_tu_berlin_de",
		"newntp_ntps1_2_uni_erlangen_de",
		"newntp_ptbtime1_ptb_de",
		"dbox_adsl_att",
		"dbox_adsl_bw",
		"dbox_adsl_pkt",
		"dbox_adsl_snr",
		"dbox_adsl_uptime",
		"if_err_eth0",
		"if_eth0",
		"multiping",
		"pisense_clock",
		"pisense_temp",
		"pisense_volt",
		"rpi_temp",
		"ntp_offset",
		"openweather_id_3012777",
		"openweather_id_2988507",
		"tinkerhumid",
		"tinkertemp",
		"tinkertemp_Bartis",
		"tinkertemp_WoZi",
		"exim_mailstats",
		"exim_mailqueue",
		"if_err_eth1",
		"if_eth1",
		"nfs_client",
		"nfsd",
		"nfs4_client",
		"nfsd4",
		"apt_all",
		"smart_sda",
		"smart_sdb",
		"smart_sdc",
		"lpstat",
		"sensors_fan",
		"hddtemp_smartctl",
		"sensors_temp",
		"sensors_volt",
		"cpuspeed",
		"ntp_states",
		"ntp_172_16_0_250",
		"ntp_172_16_0_253",
		"if_err_br0",
		"if_err_eth2",
		"if_eth2",
		"if_err_eth3",
		"if_eth3",
		"if_err_eth4",
		"if_eth4",
		"if_err_ppp_raw",
		"if_ppp_raw",
		"if_err_ppp0",
		"if_ppp0",
		"if_err_sixxs",
		"if_sixxs",
		"if_err_tap0",
		"if_tap0",
		"if_err_tun0",
		"if_tun0",
		"if_err_tun1",
		"if_tun1",
		"if_err_wlan0",
		"if_wlan0",
		"ntp_192_53_103_104",
		"ntp_192_53_103_108",
		"smart_sdd",
		"smart_sde",
		"smart_sdf",
		"postfix_mailvolume",
		"postfix_mailqueue",
		"acpi",
		"mysql_queries",
		"mysql_slowqueries",
		"mysql_threads",
		"mysql_bytes",
		"port_ssh",
		"ps_irssi",
		"ps_SCREEN",
		"volume",
		"pages_sharing",
		"libvirt",
		"port_imaps",
		"port_smtp",
		"port_xmpp_client",
		"bind9_rndc",
		"loggrep_reject",
		"munin_graph",
		"loggrep_spam",
		"ps_imapd",
		"pingler",
		"ntp_fartein_ifi_uio_no",
		"ip_193_157_115_54",
		"mysql_bin_relay_log",
		"mysql_commands",
		"mysql_connections",
		"mysql_files_tables",
		"mysql_innodb_bpool",
		"mysql_innodb_bpool_act",
		"mysql_innodb_insert_buf",
		"mysql_innodb_io",
		"mysql_innodb_io_pend",
		"mysql_innodb_log",
		"mysql_innodb_rows",
		"mysql_innodb_semaphores",
		"mysql_innodb_tnx",
		"mysql_myisam_indexes",
		"mysql_network_traffic",
		"mysql_qcache",
		"mysql_qcache_mem",
		"mysql_replication",
		"mysql_select_types",
		"mysql_slow",
		"mysql_sorts",
		"mysql_table_locks",
		"mysql_tmp_tables",
		"tcp",
		"ipmi_fans",
		"hpasmcli2_fans",
		"hpasmcli2_temp",
		"ipmi_temp",
		"ipmi_power",
		"passenger_memory",
		"passenger_processes",
		"passenger_queues",
		"passenger_requests",
		"postgres_bgwriter_9_1_main",
		"postgres_bgwriter_9_3_main",
		"postgres_cache_ALL_9_1_main",
		"postgres_cache_ALL_9_3_main",
		"postgres_checkpoints_9_1_main",
		"postgres_checkpoints_9_3_main",
		"postgres_connections_ALL_9_1_main",
		"postgres_connections_ALL_9_3_main",
		"postgres_connections_db_9_1_main",
		"postgres_connections_db_9_3_main",
		"postgres_users_9_1_main",
		"postgres_users_9_3_main",
		"postgres_size_ALL_9_1_main",
		"postgres_size_ALL_9_3_main",
		"postgres_locks_ALL_9_1_main",
		"postgres_locks_ALL_9_3_main",
		"postgres_querylength_ALL_9_1_main",
		"postgres_querylength_ALL_9_3_main",
		"postgres_xlog_9_1_main",
		"postgres_xlog_9_3_main",
		"postgres_transactions_ALL_9_1_main",
		"postgres_transactions_ALL_9_3_main",
		"ping_orm_openstreetmap_org",
		"ping_yevaud_openstreetmap_org",
		"squid_delay_pools",
		"squid_cache",
		"squid_requests",
		"squid_times",
		"squid_objectsize",
		"squid_icp",
		"squid_traffic",
		"postgres_cache_openstreetmap_9_1_main",
		"postgres_connections_openstreetmap_9_1_main",
		"postgres_size_openstreetmap_9_1_main",
		"postgres_locks_openstreetmap_9_1_main",
		"postgres_querylength_openstreetmap_9_1_main",
		"postgres_replication_9_1_main",
		"postgres_scans_openstreetmap_9_1_main",
		"postgres_transactions_openstreetmap_9_1_main",
		"postgres_tuples_openstreetmap_9_1_main",
		"memcached_commands",
		"memcached_multi_conns",
		"memcached_evictions",
		"memcached_items",
		"memcached_memory",
		"memcached_multi_bytes",
		"mod_tile_latency",
		"mod_tile_fresh",
		"mod_tile_response",
		"mod_tile_zoom",
		"postgres_cache_gis_9_1_main",
		"postgres_connections_gis_9_1_main",
		"postgres_size_gis_9_1_main",
		"postgres_locks_gis_9_1_main",
		"postgres_querylength_gis_9_1_main",
		"postgres_scans_gis_9_1_main",
		"postgres_transactions_gis_9_1_main",
		"postgres_tuples_gis_9_1_main",
		"replication_delay",
		"renderd_queue",
		"renderd_processed",
		"renderd_zoom",
		"renderd_queue_time",
		"renderd_zoom_time",
		"nominatim_importlag",
		"nominatim_requests",
		"nominatim_throttled_ips",
		"nominatim_query_speed",
		"postgres_cache_nominatim_9_3_main",
		"postgres_connections_nominatim_9_3_main",
		"postgres_size_nominatim_9_3_main",
		"postgres_locks_nominatim_9_3_main",
		"postgres_querylength_nominatim_9_3_main",
		"postgres_scans_nominatim_9_3_main",
		"postgres_transactions_nominatim_9_3_main",
		"postgres_tuples_nominatim_9_3_main",
		"if_err_em1",
		"if_em1",
		"if_err_em2",
		"if_em2",
		"if_err_p5p1",
		"if_p5p1",
		"if_err_p5p2",
		"if_p5p2",
		"network_in",
		"network_out",
		"postgres_bgwriter",
		"postgres_cache_ALL",
		"postgres_checkpoints",
		"postgres_connections_ALL",
		"postgres_connections_db",
		"postgres_users",
		"postgres_size_ALL",
		"postgres_locks_ALL",
		"postgres_querylength_ALL",
		"postgres_scans_ALL",
		"postgres_xlog",
		"postgres_transactions_ALL",
		"postgres_tuples_ALL",
		"apcpdu_ucl",
		"api_calls_spike_01",
		"api_waits_spike_01",
		"api_calls_spike_02",
		"api_waits_spike_02",
		"api_calls_spike_03",
		"api_waits_spike_03",
		"squid_times_dnsl",
		"squid_times_chits",
		"squid_times_cmis",
		"squid_times_nhits",
		"squid_times_nmr",
		"squid_times_http",
		"rrdcached",
		"api_calls_www",
		"api_calls_num",
		"api_waits_www",
		"if_err_eth5",
		"if_eth5",
		"mysql_innodb",
		"slapd_statistics_bytes",
		"slapd_connections",
		"slapd_statistics_entries",
		"slapd_statistics_referrals",
		"slapd_statistics_pdu",
		"slapd_waiters",
		"slapd_bdb_cache_pages",
		"slapd_bdb_cache_percent",
		"if_err_bond0",
		"if_bond0",
		"if_err_bond0_1",
		"if_bond0_1",
		"if_err_bond0_10",
		"if_bond0_10",
		"if_err_bond0_11",
		"if_bond0_11",
		"if_err_bond0_12",
		"if_bond0_12",
		"if_err_bond0_13",
		"if_bond0_13",
		"if_err_bond0_2",
		"if_bond0_2",
		"if_err_bond0_3",
		"if_bond0_3",
		"if_err_bond0_4",
		"if_bond0_4",
		"if_err_bond0_5",
		"if_bond0_5",
		"if_err_bond0_6",
		"if_bond0_6",
		"if_err_bond0_7",
		"if_bond0_7",
		"bonding_err_bond0",
		"bind9",
		"postfix_mailstats",
		"buddyinfo",
		"ntp_packets",
		"if_err_br_lan",
		"if_br_lan",
		"if_err_eth0VLAN1",
		"if_eth0VLAN1",
		"if_err_wlan1",
		"if_wlan1",
		"if_err_br_wifi",
		"if_br_wifi"};
}
package kr.co.treegames.tagfeed.manage.runner

import io.reactivex.Scheduler

/**
 * Created by Hwang on 2019-06-27.
 *
 * Description : 스케줄러 공급자 인터페이스
 */
interface SchedulerProvider {
    fun computation(): Scheduler
    fun io(): Scheduler
    fun ui(): Scheduler
}